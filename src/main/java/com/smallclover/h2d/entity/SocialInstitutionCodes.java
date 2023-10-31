package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialInstitutionCodes {
    private Integer cInstNameCode;

    private Integer cInstCode;

    private Integer cInstTypeCode;

    private Integer cInstBeginYear;

    private Integer cByNianhaoCode;

    private Integer cByNianhaoYear;

    private Integer cByYearRange;

    private Integer cInstBeginDy;

    private Integer cInstFloruitDy;

    private Integer cInstFirstKnownYear;

    private Integer cInstEndYear;

    private Integer cEyNianhaoCode;

    private Integer cEyNianhaoYear;

    private Integer cEyYearRange;

    private Integer cInstEndDy;

    private Integer cInstLastKnownYear;

    private Integer cSource;

    private String cPages;

    private String cNotes;

    private String cSecondarySourceAuthor;
}