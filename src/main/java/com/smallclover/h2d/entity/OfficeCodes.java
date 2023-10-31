package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfficeCodes {
    private Integer ttsSysno;

    private Integer cOfficeId;

    private Integer cDy;

    private String cOfficePinyin;

    private String cOfficeChn;

    private String cOfficePinyinAlt;

    private String cOfficeChnAlt;

    private String cOfficeTrans;

    private String cOfficeTransAlt;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private String cCategory1;

    private String cCategory2;

    private String cCategory3;

    private String cCategory4;

    private Integer cOfficeIdOld;
}