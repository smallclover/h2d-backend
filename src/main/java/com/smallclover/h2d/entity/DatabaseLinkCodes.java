package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseLinkCodes {
    private Integer cDbId;

    private String cDbUrl;

    private String cDbName;

    private String cDbNameTransChn;

    private String cDbNameTransEng;

    private String cDbInstitution;

    private String cDbInstitutionTransChn;

    private String cDbInstitutionTransEng;

    private String cDbDateOfOrigin;

    private String cDbContactPerson;

    private String cDbUrlFirstString;

    private String cDbUrlSecondString;

    private String cNotes;
}