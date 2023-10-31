package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialInstitutionTypes {
    private Integer cInstTypeCode;

    private String cInstTypePy;

    private String cInstTypeHz;
}