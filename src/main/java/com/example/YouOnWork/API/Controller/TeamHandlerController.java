package com.example.YouOnWork.API.Controller;

import com.example.YouOnWork.API.Controller.Exptions.AuthenticationException;
import com.example.YouOnWork.API.Controller.Interfaces.*;
import com.example.YouOnWork.API.Model.Response.StatusListResponse;
import com.example.YouOnWork.API.Model.Team;
import com.example.YouOnWork.API.Request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/Team")
public class TeamHandlerController {

    @Autowired
    private ITeamService teamService;

    @Autowired
    private IJwtUserService userService;

    @Autowired
    private IStatusService statusService;

    @Autowired
    private ITaskService taskService;

    @PostMapping("")
    public void addNewTeam(@RequestBody CreateTeamRequest request) {
        try {

              teamService.addNewTeam(request.getTeamName(), getUserId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("")
    public List<Team> getAllTeams() throws AuthenticationException {

        try {
            List<Team> teams = teamService.getAllTeams(getUserId());
            return teams;

        } catch (Exception ex) {

            return null;

        }
    }

    @DeleteMapping("/{teamId}")
    public void deleteTeam(@PathVariable int teamId){
        try {

            teamService.deleteTeam(teamId);

        } catch (Exception ex) {
        }
    }

    @PostMapping("/Status")
    public void addNewStatus(@RequestBody CreatStatus request) {

        try {
            statusService.addNewStatus(request.getStatusText(), request.getTeamId());

        } catch (Exception ex) {

        }

    }

    @GetMapping("/Status/{id}")
    public List<StatusListResponse> getAllStatus(@PathVariable int id) {
        try {

            List<Team> teams = teamService.getAllTeams(getUserId());
            for (Team team : teams) {
                if (team.getTeamId() == id) {
                    return statusService.getAllStatus(id);
                }
            }
            return null;
        } catch (Exception ex) {
            return null;
        }

    }

    @PostMapping("/Status/Task")
    public void addTask(@RequestBody CreateTaskRequest request) {
        try {

            taskService.addTask(request.getTaskText(), request.getStatusId());

        } catch (Exception ex) {
        }

    }

    @PutMapping("/Status/Task/{taskId}/{statusId}")
    public void changeTaskStatus(@PathVariable int taskId, @PathVariable int statusId) {
        try {

            taskService.changeTaskStatus(taskId, statusId);

        } catch (Exception ex) {

        }
    }

    @DeleteMapping("/Status/Task/{taskId}")
    public void deleteTask(@PathVariable int taskId) {
        try {

            taskService.deleteTask(taskId);

        } catch (Exception ex) {
        }

    }
    @DeleteMapping("/Status/{statusId}")
    public void deleteStatus(@PathVariable int statusId) {
        try {

            statusService.deleteStatus(statusId);

        } catch (Exception ex) {
        }

    }

    public int getUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return userService.getUserId(userDetails.getUsername());
    }

}

