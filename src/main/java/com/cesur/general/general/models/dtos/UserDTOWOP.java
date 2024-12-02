package com.cesur.general.general.models.dtos;

import java.time.LocalDateTime;

import com.cesur.general.general.models.utils.enums.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTOWOP {
     private Long id;

    private String name;

    private String email;

    private Roles rol;

    private Boolean active;

    private LocalDateTime lastConnection;

}
