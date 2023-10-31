package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialInstitutionCodesConversion {
    private Integer cInstNameCode;

    private Integer cInstCode;

    private Integer cInstCodeNew;

    private Integer cNewNewCode;
}