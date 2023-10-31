package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssocCodes {
    private Integer cAssocCode;

    private Integer cAssocPair;

    private Integer cAssocPair2;

    private String cAssocDesc;

    private String cAssocDescChn;

    private String cAssocRoleType;

    private Integer cSortorder;

    private String cExample;
}