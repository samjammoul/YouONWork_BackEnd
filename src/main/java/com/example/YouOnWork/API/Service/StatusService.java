package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Controller.Interfaces.IStatusService;
import com.example.YouOnWork.API.Dal.StatusRepo;
import com.example.YouOnWork.API.Dal.TaskRepo;
import com.example.YouOnWork.API.Model.Response.StatusListResponse;
import com.example.YouOnWork.API.Model.Status;
import com.example.YouOnWork.API.Model.Task;
import com.example.YouOnWork.API.Service.Factory.StatusFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StatusService implements IStatusService {

    @Autowired
    private StatusRepo statusRepo;
    @Autowired
    private StatusService statusService;

    @Autowired
    private TaskRepo taskRepo;

    private StatusFactory statusFactory = new StatusFactory();


    public StatusService() {

    }


    public StatusService(StatusService statusService) {
        this.statusService = statusService;

    }


    public void addNewStatus(String statusText, int groupId) {
        /*
        try {

         */
        statusRepo.save(statusFactory.createStatus(statusText, groupId));
        
            /*
        }catch (Exception ex){
            System.out.println(ex);
        }

             */
    }

    public void updateStatus(int statusId, int groupId) {
        /*
        try {

         */
        Status status = statusRepo.findStatusById(statusId);
        status.setTeamId(groupId);
        statusRepo.save(status);

            /*
        }catch (Exception ex){
            System.out.println(ex);
        }

             */
    }

    public List<StatusListResponse> getAllStatus(int teamId) {
        List<StatusListResponse> statusListResponses = new ArrayList<>();
        List<Status> statusList = statusRepo.findByTeamId(teamId);
        for (Status s:statusList
             ) {
            statusListResponses.add(new StatusListResponse(s.getId(),s.getStatusText(),s.getTeamId()));
        }

        for (StatusListResponse statusListResponse:statusListResponses) {
           List<Task> taskList = taskRepo.findByStatusId(statusListResponse.getId());
            statusListResponse.setTaskList(taskList);
        }
        return statusListResponses;

    }
    public void deleteStatus(int statusId){
         Status status = statusRepo.findStatusById(statusId);
         statusRepo.delete(status);
    }
}
