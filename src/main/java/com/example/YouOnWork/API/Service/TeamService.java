package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Controller.Interfaces.ITeamService;
import com.example.YouOnWork.API.Dal.TeamRepo;
import com.example.YouOnWork.API.Dal.TeamUserRepo;
import com.example.YouOnWork.API.Model.Team;
import com.example.YouOnWork.API.Model.TeamUser;
import com.example.YouOnWork.API.Service.Factory.TeamFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
        /*
        try {

         */
            teamRepo.save(teamFactory.createTeam(teamName,adminId));
            /*
        }catch (Exception ex){
            System.out.println(ex);
        }

             */
    }

    public List<Team> getAllTeams(int userId){
        /*
        try {

         */
        List<Team> teams = new ArrayList<>();
        List<TeamUser> teamUserList = teamUserRepo.findByUserId(userId);
        for (TeamUser teamUser:teamUserList) {
            teams.add(teamRepo.findByTeamId(teamUser.getTeamId()));
        }
       return teams;
            /*
        }catch (Exception ex){
            System.out.println(ex);
        }

             */
    }
}
