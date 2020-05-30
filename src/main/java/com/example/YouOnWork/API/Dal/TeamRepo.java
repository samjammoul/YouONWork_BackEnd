package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Team, Long> {
    Team findByTeamId(int teamId);
}
