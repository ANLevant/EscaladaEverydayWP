package com.escaladaeveryday.business.service;

import com.escaladaeveryday.business.dto.RoleDTO;
import com.escaladaeveryday.business.dto.UserDTO;

public interface IRoleService {
    RoleDTO getUserRole(UserDTO userToQueryRoleDTO);
}
