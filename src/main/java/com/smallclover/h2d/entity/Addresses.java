package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Addresses {
    private Integer cAddrId;

    private String cAddrCbd;

    private String cName;

    private String cNameChn;

    private String cAdminType;

    private Integer cFirstyear;

    private Integer cLastyear;

    private Double xCoord;

    private Double yCoord;

    private Integer belongs1Id;

    private String belongs1Name;

    private Integer belongs2Id;

    private String belongs2Name;

    private Integer belongs3Id;

    private String belongs3Name;

    private Integer belongs4Id;

    private String belongs4Name;

    private Integer belongs5Id;

    private String belongs5Name;
}