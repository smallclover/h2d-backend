package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dynasties {
    private Integer cDy;

    private String cDynasty;

    private String cDynastyChn;

    private Integer cStart;

    private Integer cEnd;

    private Integer cSort;
}