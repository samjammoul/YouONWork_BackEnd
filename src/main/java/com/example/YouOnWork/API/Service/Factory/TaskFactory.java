package com.example.YouOnWork.API.Service.Factory;

import com.example.YouOnWork.API.Model.Task;

public class TaskFactory {
    public TaskFactory( ) { }


    public Task createTask(String taskText, int status) {

        return new Task(
                 taskText,  status

        );
    }
}
