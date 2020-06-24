package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepo extends JpaRepository<Task, Long> {

    Task findTaskById ( @Param("statusId") int statusId) ;
    List<Task> findByStatusId( @Param("statusId") int statusId);
}
