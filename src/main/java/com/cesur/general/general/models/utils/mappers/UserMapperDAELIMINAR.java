package com.cesur.general.general.models.utils.mappers;

import java.time.LocalDateTime;

import com.cesur.general.general.models.User;
import com.cesur.general.general.models.dtos.UserDTO;
import com.cesur.general.general.models.dtos.UserDTOWOP;

public class UserMapperDAELIMINAR {
    public static UserDTO UserToDTO(User user) {
        UserDTO response = new UserDTO();
        if (response != null) {
            response.setRol(user.getRol());
            response.setEmail(user.getEmail());
            response.setId(user.getId());
            response.setLastConnection(user.getLastConnection());
            response.setPassword(user.getPassword());
        }
        return response;
    }

    public static UserDTOWOP UserToDTOWOP(User user) {
        UserDTOWOP response;
        if (user != null) {
            response = new UserDTOWOP(user.getId(), user.getName(), user.getEmail(), user.getRol(), user.getActive(),
                    user.getLastConnection());
        } else {
            response = new UserDTOWOP();
        }
        return response;
    }

    public static User dtoToUser(UserDTO userDTO) {
        User response = new User();
        if (userDTO != null) {
            response.setId(userDTO.getId());
            response.setName(userDTO.getName());
            response.setEmail(userDTO.getEmail());
            response.setPassword(userDTO.getPassword());
            response.setRol(userDTO.getRol());
            response.setActive(userDTO.getActive());
            if (userDTO.getCreateAt() == null) {
                response.setCreateAt(LocalDateTime.now());
            } else {
                response.setCreateAt(userDTO.getCreateAt());
                if (userDTO.getDeleteAt() != null) {
                    response.setDeleteAt(userDTO.getDeleteAt());
                }
            }

        }
        return response;
    }

}
