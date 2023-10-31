package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddrCodes {
    private Integer cAddrId;

    private String cName;

    private String cNameChn;

    private Integer cFirstyear;

    private Integer cLastyear;

    private String cAdminType;

    private Double xCoord;

    private Double yCoord;

    private Integer chgisPtId;

    private String cNotes;

    private String cAltNames;
}