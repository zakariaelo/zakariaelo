package com.elouarak.spring.demo.service;

import com.elouarak.spring.demo.dtos.UserDto;
import com.elouarak.spring.demo.responses.UserResponse;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDto createUser(UserDto userDto);

}
