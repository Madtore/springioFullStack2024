package com.cesur.general.general.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesur.general.general.models.dtos.UserDTO;
import com.cesur.general.general.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("")
    public ResponseEntity<UserDTO> storeUser(@Validated @RequestBody UserDTO UserDto) {
        try {
            userService.storeUser(UserDto);
            return new ResponseEntity<UserDTO>(UserDto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<UserDTO>(UserDto, HttpStatus.BAD_REQUEST);
        }
    }
    
    
}
