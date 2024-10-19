package com.cesur.general.general.controllers;

import com.cesur.general.general.models.dtos.IncidenceDTO;
import com.cesur.general.general.services.IncidenceService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class IncidenceController {

    @Autowired
    private IncidenceService incidenceService;

    @PostMapping("/incidence/store")
    public ResponseEntity<?> storeIncidence1(@Validated @RequestBody IncidenceDTO incidence) {

        incidenceService.storeIncidence(incidence);
        return new ResponseEntity<IncidenceDTO>(incidence, HttpStatus.CREATED);
    }

    @PostMapping("/incidence")
    public ResponseEntity<?> storeIncidence(@Validated @RequestBody IncidenceDTO incidence) {
        try {
            incidenceService.storeIncidence(incidence);
            return new ResponseEntity<IncidenceDTO>(incidence, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<IncidenceDTO>(incidence, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/incidence/:id")
    public ResponseEntity<?> addIncidenteDetail(@PathParam(value = "id") Integer id) {
        try {
            IncidenceDTO incidenceDTO = incidenceService.getIncidenceById(Long.valueOf(id));
            incidenceService.storeIncidence(incidenceDTO);
            return new ResponseEntity<IncidenceDTO>(HttpStatus.UPGRADE_REQUIRED);
        } catch (Exception e) {
            return new ResponseEntity<IncidenceDTO>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/foo")
    public ResponseEntity<?> foo(HttpServletRequest request) {
        Map<String, Object> data = new HashMap<>();
        data.put("Message", "HELLO");
        return ResponseEntity.ok(data);
    }
}
