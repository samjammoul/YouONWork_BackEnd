package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Controller.Interfaces.ITeamService;
import com.example.YouOnWork.API.Dal.TeamRepo;
import com.example.YouOnWork.API.Dal.TeamUserRepo;
import com.example.YouOnWork.API.Model.Task;
import com.example.YouOnWork.API.Model.Team;
import com.example.YouOnWork.API.Model.TeamUser;
import com.example.YouOnWork.API.Service.Factory.TeamFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TeamService implements ITeamService {

    @Autowired
    private TeamRepo teamRepo;
    @Autowired
    private UserService userService;

    @Autowired
    private TeamUserRepo teamUserRepo;

    private  TeamFactory teamFactory = new TeamFactory();



    public TeamService() {

    }


    public TeamService(UserService userService) {
        this.userService = userService;

    }


    public void addNewTeam(String teamName,int adminId ){

        try {
            Team newTeam = teamFactory.createTeam(teamName,adminId);
            teamRepo.save(newTeam);
            Team savedTeam = teamRepo.findByAdminIdAndTeamName( adminId , teamName);
            teamUserRepo.save(new TeamUser(savedTeam.getTeamId(),adminId));

        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    public List<Team> getAllTeams(int userId){

        try {

        List<Team> teams = new ArrayList<>();
        List<TeamUser> teamUserList = teamUserRepo.findByUserId(userId);
        for (TeamUser teamUser:teamUserList) {
            teams.add(teamRepo.findByTeamId(teamUser.getTeamId()));
        }
       return teams;

        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }


    }

    @Override
    public void deleteTeam(int teamId) {
        try {

            Team team = teamRepo.findByTeamId(teamId);
            teamRepo.delete(team);


        }catch (Exception ex){

        }
    }
}
