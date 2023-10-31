package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OccasionCodes {
    private Integer cOccasionCode;

    private String cOccasionDesc;

    private String cOccasionDescChn;

    private Integer cSortorder;
}