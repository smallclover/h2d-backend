package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class YearRangeCodes {
    private Integer cRangeCode;

    private String cRange;

    private String cRangeChn;

    private String cApprox;

    private String cApproxChn;
}