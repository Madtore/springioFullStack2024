package com.cesur.general.general.models.utils.mappers;
import java.time.LocalDateTime;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import com.cesur.general.general.models.User;
import com.cesur.general.general.models.dtos.UserDTO;

@Mapper
public interface UserMapper {

    UserMapper instance = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);
    
    User userDtoToUser(UserDTO userDTO);

    @Mapping(target = "id", ignore = true)
    User userDtoToUserWithOutId(UserDTO userDTO);

    // condiciones compleja
    @Mapping(target = "password", ignore = true)
    UserDTO userToUserDtoWithOutPassword(User user);

    @Mapping(target = "lastConnetcion", qualifiedByName = "calculateLastConnetcion" )
    UserDTO userToUserDtoLastConnetion(User user);


    default LocalDateTime calculateLastConnetcion(){
        return LocalDateTime.now();
    }
}
