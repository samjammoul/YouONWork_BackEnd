package com.example.YouOnWork.API.Model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "team")
public class Team {

    private int teamId;
    private String teamName;
    private int adminId;


    public Team(String teamName,int adminId ) {
        this.teamName = teamName;
        this.adminId = adminId;

    }

    public Team( ) {

    }



    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getAdminId() {
        return adminId;
    }


    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }


}
