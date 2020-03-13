package com.example.YouOnWork.API.Model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    private Long id ;
    private String username;
//    @Column( columnDefinition = "LONGVARBINARY")
    private String password;

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public User( String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
