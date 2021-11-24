package com.example.tp_dlabs.presentation;

import com.example.tp_dlabs.business.UserBO;
import com.example.tp_dlabs.business.UserDTO;
import com.example.tp_dlabs.security.PasswordBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserBO userBO;

    @Autowired
    private PasswordBO passwordBO;

    @PostMapping(path="/public/user")
    @Transactional
    public void create(@RequestBody UserDTO userDTO){
        System.out.println(userDTO.toString());
        userDTO.setPassword(passwordBO.encode(userDTO.getPassword()));
        userBO.createOne(userDTO);
    }
}
