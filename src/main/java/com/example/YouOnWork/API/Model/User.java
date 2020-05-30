package com.example.YouOnWork.API.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "user")
public class User implements UserDetails {
   @Id
    @Column(name = "id")
    private int id;

  @Column(name = "username")
   @NotNull
//   @Size(min = 3, max = 30)
    private String username;
   @JsonIgnore
 //   @Column(name = "password", length = 20)
  @NotNull
 // @Size(min = 3, max = 20)
    private String password;




    public User() {

    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;


    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


     @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setId(int id) {
        this.id = id;
    }



    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }


}
