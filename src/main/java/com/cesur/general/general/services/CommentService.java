package com.cesur.general.general.services;

import java.util.List;

import com.cesur.general.general.models.dtos.CommentDTO;

public interface CommentService {

    void saveComment(CommentDTO comment);

    List<CommentDTO> getCommentsByIncidenceId(Long id);

    void deleteComment(Long id);
}
