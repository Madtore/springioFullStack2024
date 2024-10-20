package com.cesur.general.general.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cesur.general.general.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query("SELECT c FROM CommentEntity c WHERE c.incidence.id = :incidenceId")
    List<Comment> findByIncidenceId(Long incidenceId);

}
