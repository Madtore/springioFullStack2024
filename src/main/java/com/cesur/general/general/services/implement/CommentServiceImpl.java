package com.cesur.general.general.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesur.general.general.models.Comment;
import com.cesur.general.general.models.dtos.CommentDTO;
import com.cesur.general.general.repositories.CommentRepository;
import com.cesur.general.general.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    public CommentRepository commentRepository;

    @Override
    public void saveComment(CommentDTO comment) {
        Comment commentEntity = new Comment();
        commentEntity.setContent(comment.getContent());
        commentEntity.setCreatedAt(comment.getCreatedAt());
        commentEntity.setUserCreated(comment.getUserCreated());
        commentEntity.setIncidence(comment.getIncidence());

        commentRepository.save(commentEntity);
    }

    @Override
    public List<CommentDTO> getCommentsByIncidenceId(Long id) {
        return commentRepository.findByIncidenceId(id)
                .stream()
                .map(comment -> {
                    CommentDTO commentDTO = new CommentDTO();
                    commentDTO.setId(comment.getId());
                    commentDTO.setContent(comment.getContent());
                    commentDTO.setCreatedAt(comment.getCreatedAt());
                    commentDTO.setUserCreated(comment.getUserCreated());
                    commentDTO.setIncidence(comment.getIncidence());
                    return commentDTO;
                })
                .toList();
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

}
