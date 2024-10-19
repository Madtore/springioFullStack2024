package com.cesur.general.general.models.dtos;

import com.cesur.general.general.models.Incidence;
import com.cesur.general.general.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatDTO {

    private Long id;

    private String message;

    private User userCreated;

    private Incidence incidence;

}
