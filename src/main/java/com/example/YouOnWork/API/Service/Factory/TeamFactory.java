package com.example.YouOnWork.API.Service.Factory;

import com.example.YouOnWork.API.Model.Team;

public class TeamFactory {

    public TeamFactory( ) { }


    public Team createTeam(String teamName,int adminId) {

        return new Team(
          teamName,adminId

        );
    }
}
