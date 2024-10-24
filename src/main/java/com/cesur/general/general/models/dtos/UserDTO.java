package com.cesur.general.general.models.dtos;


import java.time.LocalDateTime;



import com.cesur.general.general.models.utils.enums.Roles;
import com.cesur.general.general.models.utils.validadors.StrongPassword;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @NotEmpty(message = "Se debe agregar un nombre")
    @NotNull(message = "Se debe agregar un nombre")
    private String name;

    @Email(message = "Se debe agregar un email valido")
    @NotNull(message = "Se debe agregar un email")
    private String email;

    @StrongPassword
    private String password;

    @NotNull(message = "Se debe agregar un rol")
    private Roles rol;

    @NotNull(message = "Se debe agregar un estado")
    private Boolean active;

    private LocalDateTime lastConnection;


    private LocalDateTime createAt;
    private LocalDateTime deleteAt;
    private LocalDateTime updateAt;
}
