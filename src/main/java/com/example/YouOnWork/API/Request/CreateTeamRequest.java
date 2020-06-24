package com.example.YouOnWork.API.Request;

public class CreateTeamRequest {

    private String teamName;

    public CreateTeamRequest(String teamName) {
        this.teamName = teamName;
    }

    public CreateTeamRequest( ) {

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
