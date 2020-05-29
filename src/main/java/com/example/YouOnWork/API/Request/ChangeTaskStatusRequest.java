package com.example.YouOnWork.API.Request;

public class ChangeTaskStatusRequest {

    private int taskId;
    private int statusId;

    public ChangeTaskStatusRequest(int taskId, int statusId) {
        this.taskId = taskId;
        this.statusId = statusId;
    }

    public ChangeTaskStatusRequest() {

    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
