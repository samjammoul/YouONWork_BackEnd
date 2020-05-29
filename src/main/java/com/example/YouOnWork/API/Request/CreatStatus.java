package com.example.YouOnWork.API.Request;

public class CreatStatus {

    private String statusText;
    private int teamId;

    public CreatStatus(String statusTex, int teamId) {
        this.statusText = statusTex;
        this.teamId = teamId;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusTex(String statusTex) {
        this.statusText = statusTex;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
