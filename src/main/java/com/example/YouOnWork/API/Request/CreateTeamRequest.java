package com.example.YouOnWork.API.Request;

public class CreateTeamRequest {

    private String teamName;
    private int adminId;

    public CreateTeamRequest(String teamName, int adminId) {
        this.teamName = teamName;
        this.adminId = adminId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
}
