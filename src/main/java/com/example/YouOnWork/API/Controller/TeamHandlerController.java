package com.example.YouOnWork.API.Controller;

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
        //   try {


        if (userService.findUserById(request.getAdminId()) != 0) {
            teamService.addNewTeam(request.getTeamName(), request.getAdminId());

/*
    }catch (Exception ex){}

 */

        }
    }

        @GetMapping  ("")
        public List<Team> getAllTeams () {


            //   try {
            List<Team> teams = teamService.getAllTeams(getUserId());
/*
        }else {

            // Ex..
        }


/*
    }catch (Exception ex){}

 */
        return teams;
        }

        @PostMapping("/Status")
        public void addNewStatus (@RequestBody CreatStatus request){
            //   try {


            statusService.addNewStatus(request.getStatusText(), request.getTeamId());



/*
    }catch (Exception ex){}

 */

        }

    @GetMapping("/Status/{id}")
    public List<StatusListResponse> getAllStatus (@PathVariable int id){
        //   try {

        List<Team> teams = teamService.getAllTeams(getUserId());
        for (Team team:teams
        ) {
            if (team.getTeamId() == id) {
                return statusService.getAllStatus(id);

            }
            // ex


        }
        return null ;

/*
    }catch (Exception ex){}

 */

    }



        @PostMapping("/Status/Task")
        public void addTask (@RequestBody CreateTaskRequest request){
            //   try {


            taskService.addTask(request.getTaskText(), request.getStatusId());



/*
    }catch (Exception ex){}

 */

        }

        @PutMapping("/Status/Task/{taskId}/{statusId}")
        public void changeTaskStatus (@PathVariable int taskId,@PathVariable int statusId){
             try {
            taskService.changeTaskStatus(taskId, statusId);





    }catch (Exception ex){
                 System.out.println(ex);
             }



        }

        @DeleteMapping("/Status/Task/{taskId}")
        public void deleteTask (@PathVariable int taskId){
            //   try {


            taskService.deleteTask(taskId);



/*
    }catch (Exception ex){}

 */

        }

        public int getUserId () {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            return userService.getUserId(userDetails.getUsername());
        }

    }

