package com.example.YouOnWork.API.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/UserHandler")
public class UserHandlerController {

    @PostMapping("/")
    public void singIn(   ) {

    }

    @PostMapping("/SingUp")
    public void singUp( ) {

    }

}


