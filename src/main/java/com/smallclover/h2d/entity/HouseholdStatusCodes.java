package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HouseholdStatusCodes {
    private Integer cHouseholdStatusCode;

    private String cHouseholdStatusDesc;

    private String cHouseholdStatusDescChn;
}