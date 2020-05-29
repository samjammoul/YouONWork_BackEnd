package com.example.YouOnWork.API.Request;

public class CreateTaskRequest {

    private String taskText;
    private int statusId;

    public CreateTaskRequest(String taskText, int statusId) {
        this.taskText = taskText;
        this.statusId = statusId;
}

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
