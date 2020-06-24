package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Team, Long> {
    Team findByTeamId( @Param("teamId") int teamId);
    Team findByAdminIdAndTeamName (@Param("teamId")int adminId , @Param("teamName")String teamName);
}
