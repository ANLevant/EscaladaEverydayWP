package com.escaladaeveryday.business.rest.controller;

import com.escaladaeveryday.business.dto.UserDTO;
import com.escaladaeveryday.business.exception.LogException;
import com.escaladaeveryday.business.service.IUserService;
import com.escaladaeveryday.persistence.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody UserDTO userToCreateDTO) {
        userService.createUser(userToCreateDTO);
    }

    @RequestMapping(path = "/{username}/login", method = RequestMethod.PUT)
    public UserDTO logUser(@PathVariable String username, UserDTO userToLogDTO) throws LogException {
        userToLogDTO.setUsername(username);

        return userService.logUser(userToLogDTO);
    }
}
