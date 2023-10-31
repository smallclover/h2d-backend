package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KinMourning {
    private String cKinrel;

    private String cKinrelAlt;

    private String cKinrelChn;

    private String cMourning;

    private String cMourningChn;

    private String cKindist;

    private String cKintype;

    private String cKintypeDesc;

    private String cKintypeDescChn;

    private String cNotes;
}