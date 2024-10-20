package com.cesur.general.general.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.general.general.models.Comment;
import com.cesur.general.general.models.dtos.CommentDTO;
import com.cesur.general.general.services.CommentService;

public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentService commentService;

    @Override
    public void saveComment(CommentDTO comment) {
        Comment commentEntity = new Comment();
        commentEntity.setContent(comment.getContent());
        commentEntity.setCreatedAt(comment.getCreatedAt());
        commentEntity.setUserCreated(comment.getUserCreated());
        commentEntity.setIncidence(comment.getIncidence());

        commentService.saveComment(comment);
    }

    @Override
    public List<CommentDTO> getCommentsByIncidenceId(Long id) {
        return new CommentServiceImpl().getCommentsByIncidenceId(id).stream()
                .map((comment) -> {
                    CommentDTO commentDTO = new CommentDTO();
                    commentDTO.setId(comment.getId());
                    commentDTO.setContent(comment.getContent());
                    commentDTO.setCreatedAt(comment.getCreatedAt());
                    commentDTO.setUserCreated(comment.getUserCreated());
                    commentDTO.setIncidence(comment.getIncidence());
                    return commentDTO;
                }).toList();
    }

    @Override
    public void deleteComment(Long id) {
        commentService.deleteComment(id);
    }

}
