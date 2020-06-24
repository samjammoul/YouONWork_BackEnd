package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeamUserRepo extends JpaRepository<TeamUser, Integer> {
    List<TeamUser> findByUserId( @Param("userId") int userId);

}
