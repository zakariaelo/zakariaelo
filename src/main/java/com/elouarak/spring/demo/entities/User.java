package com.elouarak.spring.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@AllArgsConstructor@NoArgsConstructor@Getter@Setter
public class User {
    @Id @GeneratedValue
    private Long id;
    private String userId;

    //api
    @Column(nullable = false,length = 50)
    private String firstname;
    @Column(nullable = false, length = 50)
    private String lastname;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String encryptedpassword;
    @Column(nullable = true)
    private String emailverificationtoken;
    private Boolean emailverificationstatus = false;

}
