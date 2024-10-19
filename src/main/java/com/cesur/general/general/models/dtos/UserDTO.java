package com.cesur.general.models.dtos;

import java.time.LocalDateTime;

import com.cesur.general.models.utils.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    private Roles rol;

    private LocalDateTime createUpdate;

    private Boolean active;

    private LocalDateTime deleteAt;

    private LocalDateTime updateAt;

    private LocalDateTime lastConnection;
}
