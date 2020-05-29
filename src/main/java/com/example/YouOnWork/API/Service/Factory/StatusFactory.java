package com.example.YouOnWork.API.Service.Factory;

import com.example.YouOnWork.API.Model.Status;
import com.example.YouOnWork.API.Model.User;

public class StatusFactory {
    public StatusFactory() {
    }


    public Status createStatus(String statusText, int groupId) {
        return new Status(statusText,groupId);
    }

}
