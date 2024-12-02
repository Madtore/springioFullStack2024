package com.cesur.general.general.models.dtos;

import java.time.LocalDateTime;

import com.cesur.general.general.models.Incidence;
import com.cesur.general.general.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

    private Long id;

    private String content;

    private LocalDateTime createdAt;

    private User userCreated;

    private Incidence incidence;

}
