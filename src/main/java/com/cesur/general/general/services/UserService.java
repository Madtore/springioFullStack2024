package  com.cesur.general.general.services;

import com.cesur.general.general.models.dtos.UserDTO;

public interface UserService {

    void storeUser(UserDTO userDTO);

    UserDTO getUserByEmail(String email);

    void updateUser(Long id, UserDTO userDTO);

    void deleteUser(Long id);
}
