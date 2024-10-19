package com.cesur.general.models.dtos;

import java.time.LocalDateTime;

import com.cesur.general.models.Incidence;
import com.cesur.general.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDAO {

    private Long id;

    private String content;

    private LocalDateTime createdAt;

    private User userCreated;

    private Incidence incidence;

}
