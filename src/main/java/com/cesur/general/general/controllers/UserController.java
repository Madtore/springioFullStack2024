package com.cesur.general.general.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.cesur.general.general.models.dtos.UserDTO;
import com.cesur.general.general.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<UserDTO> getUser(@RequestParam String param) {
        return new ResponseEntity<>(userService.getUserById(Long.parseLong(param)), HttpStatus.OK);
    }

}
