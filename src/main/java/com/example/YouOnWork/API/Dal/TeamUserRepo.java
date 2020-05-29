package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamUserRepo extends JpaRepository<TeamUser, Long> {
    List<TeamUser> findByUserId(int userId);
}
