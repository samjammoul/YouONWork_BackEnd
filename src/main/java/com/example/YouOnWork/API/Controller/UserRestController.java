package com.example.YouOnWork.API.Controller;

import com.example.YouOnWork.API.Controller.Exptions.ExceptionHandler;
import com.example.YouOnWork.API.Controller.Interfaces.IJwtUserService;
import com.example.YouOnWork.API.Request.SingUpRequest;
import com.example.YouOnWork.config.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserRestController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;

    @Autowired
    private IJwtUserService iJwtUserService;



// لسا في خطا عملا رن وبحاث عن الخطـ
    @RequestMapping(value = "/SignUp",method = RequestMethod.POST)
    public ResponseEntity singUp(@RequestBody SingUpRequest request) throws ExceptionHandler {
        /*
        try {
           if(request.getPassword().equals(request.getConformPassword())){
               UserService.save(request.getUsername(),request.getPassword());
            }else {
               return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
           }


        }catch (Exception ex){
            System.out.println(ex);
            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);

        }

         */

        return ResponseEntity.ok(HttpStatus.OK);

    }
/*

    public JwtUser singUp(SingUpRequest request) {
        String token = request.getHeader(tokenHeader).substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        return (JwtUser) userDetailsService.loadUserByUsername(username);
    }

 */
}
