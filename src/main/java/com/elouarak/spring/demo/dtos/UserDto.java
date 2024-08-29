package com.elouarak.spring.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class UserDto implements Serializable {
    //db
    private long id;
    //api
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String encryptedpassword;
    private String emailverificationtoken;
    private Boolean emailverificationstatus;


}
