package com.cesur.general.general.models;

import java.time.LocalDateTime;

import com.cesur.general.general.models.utils.Roles;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "app_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 32)
    private String password;

    @Column(name = "rol", nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles rol;

    @Column(name = "createdAt")
    private LocalDateTime createUpdate;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "deleteAt")
    private LocalDateTime deleteAt;

    @Column(name = "updateAt")
    private LocalDateTime updateAt;

    @Column(name = "lastConnection")
    private LocalDateTime lastConnection;
}
