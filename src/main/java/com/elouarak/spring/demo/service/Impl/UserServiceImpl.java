package com.elouarak.spring.demo.service.Impl;

import com.elouarak.spring.demo.dtos.UserDto;
import com.elouarak.spring.demo.entities.User;
import com.elouarak.spring.demo.repositories.UserRepository;
import com.elouarak.spring.demo.service.UserService;
import com.elouarak.spring.demo.utils.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Util util;
    @Override
    public UserDto createUser(UserDto userDto) {
        User checkUser = userRepository.findByEmail(userDto.getEmail());
        if (checkUser != null) throw new RuntimeException("email already exsist");
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        user.setEncryptedpassword("");
        user.setUserId(util.generateStringId(16));
        User newUser = userRepository.save(user);
        UserDto userDto1 = new UserDto();
        BeanUtils.copyProperties(newUser,userDto1);
        return userDto1;
    }
}
