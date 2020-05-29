package com.example.YouOnWork.API.Controller.Interfaces;

import com.example.YouOnWork.API.Model.Response.StatusListResponse;
import com.example.YouOnWork.API.Model.Status;

import java.util.List;

public interface IStatusService {

    void addNewStatus(String statusText,int groupId );
    List<StatusListResponse> getAllStatus(int teamId);
}
