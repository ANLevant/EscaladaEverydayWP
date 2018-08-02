package com.escaladaeveryday.business.service;

import com.escaladaeveryday.business.dto.UserDTO;
import com.escaladaeveryday.business.exception.LogException;

public interface IUserService {

    void createUser(UserDTO userToCreateDTO);
    UserDTO logUser(UserDTO userToLogDTO) throws LogException;
}
