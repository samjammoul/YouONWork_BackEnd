package com.example.YouOnWork.API.Model;

import javax.persistence.*;

@Entity
@Table(name = "teamUser")
public class TeamUser {
    private int id;
    private int teamId;
    private int userId;

    public TeamUser() {
    }

    public TeamUser(int id, int teamId, int userId) {
        this.id = id;
        this.teamId = teamId;
        this.userId = userId;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
