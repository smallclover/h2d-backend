package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssumeOfficeCodes {
    private Integer cAssumeOfficeCode;

    private String cAssumeOfficeDescChn;

    private String cAssumeOfficeDesc;
}