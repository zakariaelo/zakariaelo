package com.elouarak.spring.demo.Controllers;

import com.elouarak.spring.demo.dtos.UserDto;
import com.elouarak.spring.demo.requests.UserRequest;
import com.elouarak.spring.demo.responses.UserResponse;
import com.elouarak.spring.demo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest){

        UserDto userDto = new UserDto();
        // past request to dto
        BeanUtils.copyProperties(userRequest,userDto);
        // persistance
        UserDto createUser = service.createUser(userDto);
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(createUser,userResponse);

        return userResponse;
    }

    @PutMapping
    public String updateUser(){
        return "";
    }

    @DeleteMapping
    public void deleteUser(){

    }
}
