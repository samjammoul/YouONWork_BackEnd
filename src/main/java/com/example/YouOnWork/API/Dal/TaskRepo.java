package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepo extends JpaRepository<Task, Long> {

    Task findTaskById (int statusId) ;
    List<Task> findByStatusId(int statusId);
}
