package com.cesur.general.general.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesur.general.general.models.dtos.CommentDTO;
import com.cesur.general.general.services.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getComments(@PathVariable("id") Long id) {
        List<CommentDTO> comments = commentService.getCommentsByIncidenceId(id);

        if (comments.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

}
