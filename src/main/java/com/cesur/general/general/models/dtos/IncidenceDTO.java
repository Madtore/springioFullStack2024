package com.cesur.general.general.models.dtos;

import com.cesur.general.general.models.utils.Priorities;
import com.cesur.general.general.models.utils.Scopes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IncidenceDTO {

    private Long id;

    private String description;

    private Priorities priority;

    private Scopes scope;

    private String userCreated;

}
