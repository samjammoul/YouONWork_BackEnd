package com.example.YouOnWork.API.Controller.Interfaces;

public interface ITaskService {
    void addTask(String taskText,int statusId );

    void changeTaskStatus(int taskId,int statusId );

    void deleteTask(int taskId );


}
