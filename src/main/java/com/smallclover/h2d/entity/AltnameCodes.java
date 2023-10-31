package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AltnameCodes {
    private Integer cNameTypeCode;

    private String cNameTypeDesc;

    private String cNameTypeDescChn;
}