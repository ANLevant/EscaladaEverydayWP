package com.escaladaeveryday.business.rest.controller;

import com.escaladaeveryday.business.dto.RoleDTO;
import com.escaladaeveryday.business.dto.UserDTO;
import com.escaladaeveryday.business.service.IRoleService;
import com.escaladaeveryday.persistence.model.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping(path = "/user/{roleId}", method = RequestMethod.GET)
    public RoleDTO getUserRole(@PathVariable int roleId) {
        UserDTO userWithRoleToGet = new UserDTO();

        userWithRoleToGet.setRoleId(roleId);

        return roleService.getUserRole(userWithRoleToGet);
    }
}
