package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {

    Status findStatusById( @Param("statusId") int statusId);
    List<Status> findByTeamId( @Param("teamId") int teamId);

}
