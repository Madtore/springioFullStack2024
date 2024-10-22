package com.cesur.general.general.models.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.NotFound;

import com.cesur.general.general.models.utils.enums.Roles;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @Nonnull
    private String name;

    @Nonnull
    private String email;

    @Nonnull
    private String password;

    @Nonnull
    private Roles rol;

    @Nonnull
    private Boolean active;

    private LocalDateTime lastConnection;

    private LocalDateTime createAt;
    private LocalDateTime deleteAt;
    private LocalDateTime updateAt;
}
