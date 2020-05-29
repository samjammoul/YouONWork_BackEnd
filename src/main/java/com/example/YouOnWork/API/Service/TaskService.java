package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Controller.Interfaces.ITaskService;
import com.example.YouOnWork.API.Dal.TaskRepo;
import com.example.YouOnWork.API.Model.Task;
import com.example.YouOnWork.API.Service.Factory.TaskFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskService implements ITaskService {

    @Autowired
    private TaskRepo taskRepo;

    private TaskFactory taskFactory = new TaskFactory();

    public void addTask(String taskText,int statusId ){
        /*
        try {

         */
        taskRepo.save(taskFactory.createTask(taskText,statusId));
            /*
        }catch (Exception ex){

        }

             */
    }

    public void changeTaskStatus(int taskId,int statusId ){
        /*
        try {

         */
       Task task = taskRepo.findTaskById(taskId);
       task.setStatusId(statusId);
       taskRepo.save(task);

            /*
        }catch (Exception ex){

        }

             */
    }

    public void deleteTask(int taskId ){
        /*
        try {

         */
        Task task = taskRepo.findTaskById(taskId);
        taskRepo.delete(task);

            /*
        }catch (Exception ex){

        }

             */
    }
}
