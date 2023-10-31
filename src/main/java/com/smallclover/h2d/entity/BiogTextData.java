package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BiogTextData {
    private Integer ttsSysno;

    private Integer cTextid;

    private Integer cPersonid;

    private Integer cRoleId;

    private Integer cYear;

    private Integer cNhCode;

    private Integer cNhYear;

    private Integer cRangeCode;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}