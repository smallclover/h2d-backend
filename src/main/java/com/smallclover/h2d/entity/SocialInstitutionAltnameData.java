package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialInstitutionAltnameData {
    private Integer cInstNameCode;

    private Integer cInstCode;

    private Integer cInstAltnameType;

    private String cInstAltnameHz;

    private String cInstAltnamePy;

    private Integer cSource;

    private String cPages;

    private String cNotes;
}