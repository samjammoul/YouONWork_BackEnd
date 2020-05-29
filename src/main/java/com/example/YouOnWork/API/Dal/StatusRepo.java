package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {

    Status findStatusById(int statusId);
    List<Status> findByTeamId(int teamId);

}
