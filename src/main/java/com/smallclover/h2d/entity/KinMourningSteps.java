package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KinMourningSteps {
    private String cKinrel;

    private Integer cUpstep;

    private Integer cDwnstep;

    private Integer cMarstep;

    private Integer cColstep;
}