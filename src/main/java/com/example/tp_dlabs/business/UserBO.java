package com.example.tp_dlabs.business;

import com.example.tp_dlabs.persistence.daos.UserDAO;
import com.example.tp_dlabs.persistence.dos.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBO {

    @Autowired
    private UserDAO userDAO;

    public void createOne(UserDTO userDTO){
        UserDO userDO = new UserDO();
        userDO.setPseudo(userDTO.getPseudo());
        userDO.setFirstName(userDTO.getFirstName());
        userDO.setLastName(userDTO.getLastName());
        userDO.setPassword(userDTO.getPassword());

        userDAO.save(userDO);
    }
}
