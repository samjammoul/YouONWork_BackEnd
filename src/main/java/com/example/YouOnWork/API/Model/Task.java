package com.example.YouOnWork.API.Model;

import javax.persistence.*;

@Entity
@Table(name = "Task")
public class Task {

    private int id ;
    private String taskText;
    private int statusId;


    public Task() {
    }

    public Task(int id, String taskText, int statusId) {
        this.id = id;
        this.taskText = taskText;
        this.statusId = statusId;
    }
    public Task( String taskText, int statusId) {

        this.taskText = taskText;
        this.statusId = statusId;
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

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
