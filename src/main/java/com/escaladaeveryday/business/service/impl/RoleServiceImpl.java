package com.escaladaeveryday.business.service.impl;

import com.escaladaeveryday.business.builder.EntityDTOBuilder;
import com.escaladaeveryday.business.dto.RoleDTO;
import com.escaladaeveryday.business.dto.UserDTO;
import com.escaladaeveryday.business.service.IRoleService;
import com.escaladaeveryday.persistence.model.RoleEntity;
import com.escaladaeveryday.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private EntityDTOBuilder<RoleEntity, RoleDTO> builder;

    @Override
    public RoleDTO getUserRole(UserDTO userToQueryRoleDTO) {
        RoleEntity roleFound = roleRepository.getOne(userToQueryRoleDTO.getRoleId());

        return builder.DTOToEntity(roleFound);
    }
}
