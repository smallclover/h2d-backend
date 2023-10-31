package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExtantCodes {
    private Integer cExtantCode;

    private String cExtantDesc;

    private String cExtantDescChn;

    private String cExtantCodeHd;
}