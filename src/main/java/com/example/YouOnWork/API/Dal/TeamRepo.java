package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.Team;
import com.example.YouOnWork.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepo extends JpaRepository<Team, Long> {
    Team findByTeamId(int teamId);
}
