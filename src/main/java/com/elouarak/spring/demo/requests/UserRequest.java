package com.elouarak.spring.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class UserRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
