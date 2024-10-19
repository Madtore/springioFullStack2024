package com.cesur.general.general.models.dtos;

import com.cesur.general.general.models.Incidence;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachedFileDTO {

    private Long id;

    private String name;

    private String mimeType;

    private String route;

    private Incidence incidence;

}
