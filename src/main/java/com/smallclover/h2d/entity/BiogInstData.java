package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BiogInstData {
    private Integer cPersonid;

    private Integer cInstNameCode;

    private Integer cInstCode;

    private Integer cBiRoleCode;

    private Integer cBiBeginYear;

    private Integer cBiByNhCode;

    private Integer cBiByNhYear;

    private Integer cBiByRange;

    private Integer cBiEndYear;

    private Integer cBiEyNhCode;

    private Integer cBiEyNhYear;

    private Integer cBiEyRange;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;

    private Integer ttsSysno;
}