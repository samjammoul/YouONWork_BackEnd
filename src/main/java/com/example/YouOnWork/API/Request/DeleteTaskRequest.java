package com.example.YouOnWork.API.Request;

public class DeleteTaskRequest {

    private int taskId;

    public DeleteTaskRequest(int taskId) {
        this.taskId = taskId;
    }

    public DeleteTaskRequest() {

    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
