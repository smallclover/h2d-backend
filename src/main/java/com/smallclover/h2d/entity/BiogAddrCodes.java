package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BiogAddrCodes {
    private Integer cAddrType;

    private String cAddrDesc;

    private String cAddrDescChn;

    private String cAddrNote;

    private Integer cIndexAddrRank;

    private Integer cIndexAddrDefaultRank;
}