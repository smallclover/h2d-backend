package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialInstitutionAltnameCodes {
    private Integer cInstAltnameType;

    private String cInstAltnameDesc;

    private String cInstAltnameChn;

    private String cNotes;
}