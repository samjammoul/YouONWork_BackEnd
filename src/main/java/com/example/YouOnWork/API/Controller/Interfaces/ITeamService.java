package com.example.YouOnWork.API.Controller.Interfaces;

import com.example.YouOnWork.API.Model.Team;

import java.util.List;

public interface ITeamService {

    void addNewTeam(String teamName,int adminId );

    List<Team> getAllTeams(int userId);

    void deleteTeam(int teamId);
}
