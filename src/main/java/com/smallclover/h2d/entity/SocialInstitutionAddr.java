package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialInstitutionAddr {
    private Integer cInstNameCode;

    private Integer cInstCode;

    private Integer cInstAddrTypeCode;

    private Integer cInstAddrBeginYear;

    private Integer cInstAddrEndYear;

    private Integer cInstAddrId;

    private Double instXcoord;

    private Double instYcoord;

    private Integer cSource;

    private String cPages;

    private String cNotes;

    private String cSecondarySourceAuthor;
}