package  com.cesur.general.general.services;

import com.cesur.general.general.models.dtos.UserDTO;

public interface UserService {

    public void saveUser(UserDTO userDTO);

    UserDTO getUserById(Long id);

    public void updateUser(UserDTO userDTO);
}
