package com.cesur.general.general.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cesur.general.general.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query("SELECT c FROM Comment c WHERE c.incidence.id = :incidence_id")
    List<Comment> findByIncidenceId(Long incidence_id);

}
