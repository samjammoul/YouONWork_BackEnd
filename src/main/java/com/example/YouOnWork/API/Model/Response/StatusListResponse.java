package com.example.YouOnWork.API.Model.Response;

import com.example.YouOnWork.API.Model.Task;

import java.util.ArrayList;
import java.util.List;

public class StatusListResponse {
    private int id ;
    private String statusText;
    private int teamId;
    private List<Task> taskList;

    public StatusListResponse(int id, String statusText, int teamId, List<Task> taskList) {
        this.id = id;
        this.statusText = statusText;
        this.teamId = teamId;
        this.taskList = taskList;
    }
    public StatusListResponse(int id, String statusText, int teamId) {
        this.id = id;
        this.statusText = statusText;
        this.teamId = teamId;
        this.taskList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
