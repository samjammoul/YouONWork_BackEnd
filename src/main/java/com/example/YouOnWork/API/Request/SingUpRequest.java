package com.example.YouOnWork.API.Request;

import com.example.YouOnWork.API.Controller.Exptions.ExceptionHandler;

public class SingUpRequest {

    private String username;
    private String password;
    private String conformPassword;

    public SingUpRequest() {

    }

    public SingUpRequest(String username, String password,String conformPassword) {
        this.username = username;
        this.password = password;
        this.conformPassword = conformPassword;
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

    public String getConformPassword() {
        return conformPassword;
    }

    public void setConformPassword(String conformPassword) {
        this.conformPassword = conformPassword;
    }
}
