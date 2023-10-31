package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KinshipCodes {
    private Integer cKincode;

    private Integer cKinPair1;

    private Integer cKinPair2;

    private String cKinPairNotes;

    private String cKinrelChn;

    private String cKinrel;

    private String cKinrelAlt;

    private Integer cPickSorting;

    private Integer cUpstep;

    private Integer cDwnstep;

    private Integer cMarstep;

    private Integer cColstep;

    private String cKinrelSimplified;
}