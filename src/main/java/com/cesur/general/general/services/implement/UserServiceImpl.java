package com.cesur.general.general.services.implement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesur.general.general.models.User;
import com.cesur.general.general.models.dtos.UserDTO;
import com.cesur.general.general.repositories.UserRepository;
import com.cesur.general.general.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void storeUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRol(userDTO.getRol());
        user.setActive(userDTO.getActive());
        user.setCreateAt(LocalDateTime.now());
        
        userRepository.save(user);
    }

    

    @Override
    public void updateUser(Long id, UserDTO user) {

    }



    @Override
    public UserDTO getUserByEmail(String email) {
        User user = userRepository.getUserByEmail(email).get();
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setActive(user.getActive());
        userDTO.setId(user.getId());
        userDTO.setLastConnection(user.getLastConnection());
        userDTO.setRol(user.getRol());
        return userDTO;
    }



    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
