package com.cesur.general.general.services.implement;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.general.general.models.User;
import com.cesur.general.general.models.dtos.UserDTO;
import com.cesur.general.general.models.utils.Roles;
import com.cesur.general.general.repositories.UserRepository;
import com.cesur.general.general.services.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRol(userDTO.getRol());
        userRepository.save(user);
    }

    @Override
    public UserDTO getUserById(Long id) {

        User user = userRepository.findById(id).get();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setRol(user.getRol());
        return userDTO;
    }

    @Override
    public void updateUser(UserDTO userDTO) {

        User user = userRepository.findById(userDTO.getId()).get();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRol(userDTO.getRol());
        userRepository.save(user);
    }

}
