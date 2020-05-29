package com.example.YouOnWork.API.Controller;

import com.example.YouOnWork.API.Configuration.Security.JwtResponse;
import com.example.YouOnWork.API.Model.Requests.JwtRequest;
import com.example.YouOnWork.API.Controller.Exptions.AuthenticationException;
import com.example.YouOnWork.API.Controller.Interfaces.IUserService;
import com.example.YouOnWork.config.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@CrossOrigin
@RestController
public class AuthenticationRestController {
   @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil tokenUtil;

    @Autowired
    private IUserService userService;

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;

    @RequestMapping(value = "/SignIn", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest

    ) throws AuthenticationException {

        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        System.out.println(authenticationRequest.getUsername());

        // Reload password post-security so we can generate the token
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String token = tokenUtil.generateToken(userDetails.getUsername());
        final int userId = userService.getUserId(userDetails.getUsername());

        // Return the token
        return ResponseEntity.ok(new JwtResponse(token));

    }
    /*
    @RequestMapping(value = "/SingIn2", method = RequestMethod.POST)
    public String createAuthenticationToken(@RequestBody String username) throws AuthenticationException {

        // Return the token
        return username ;
    }

     */

    @RequestMapping(value = "/test",method =RequestMethod.GET)
    public String sayHello(){
        return "Hey there";
    }





    /**
     * Authenticates the user. If something is wrong, an {@link AuthenticationException} will be thrown
     */
    private void authenticate(String username, String password) {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new AuthenticationException("User is disabled!", e);
        } catch (BadCredentialsException e) {
            throw new AuthenticationException("Bad credentials!", e);
        }
    }





}
