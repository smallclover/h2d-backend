package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NianHao {
    private Integer cNianhaoId;

    private Integer cDy;

    private String cDynastyChn;

    private String cNianhaoChn;

    private String cNianhaoPin;

    private Integer cFirstyear;

    private Integer cLastyear;
}