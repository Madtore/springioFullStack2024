package com.cesur.general.services;

import com.cesur.general.models.dtos.UserDTO;

public interface UserService {

    public void saveUser(UserDTO userDTO);

    UserDTO getUserById(Long id);

    public void updateUser(UserDTO userDTO);
}
