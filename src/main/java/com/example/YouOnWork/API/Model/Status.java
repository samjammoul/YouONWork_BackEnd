package com.example.YouOnWork.API.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Status")
public class Status {

    private int id ;
    private String statusText;
    private int teamId;


    public Status(int id, String statusText, int teamId) {
        this.id = id;
        this.statusText = statusText;
        this.teamId = teamId;
    }
    public Status( String statusText, int teamId) {

        this.statusText = statusText;
        this.teamId = teamId;
    }
    public Status( ) {
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

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }


}
