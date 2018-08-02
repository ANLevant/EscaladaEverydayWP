package com.escaladaeveryday.business.service.impl;

import com.escaladaeveryday.business.builder.EntityDTOBuilder;
import com.escaladaeveryday.business.dto.UserDTO;
import com.escaladaeveryday.business.exception.LogException;
import com.escaladaeveryday.business.service.IUserService;
import com.escaladaeveryday.persistence.model.UserEntity;
import com.escaladaeveryday.persistence.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityDTOBuilder<UserEntity, UserDTO> builder;

    @Override
    public void createUser(UserDTO userToCreateDTO) {
        UserEntity userToCreate = builder.entityToDTO(userToCreateDTO);
        userRepository.save(userToCreate);
    }

    @Override
    public UserDTO logUser(UserDTO userToLogDTO) throws LogException {
        UserEntity foundUser =  userRepository.findByUsername(userToLogDTO.getUsername());

        if(foundUser.getPassword() == userToLogDTO.getPassword() && foundUser != null){
            return builder.DTOToEntity(foundUser);
        }
        else{
            throw new LogException();
        }
    }
}
