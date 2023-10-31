package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BiogInstCodes {
    private Integer cBiRoleCode;

    private String cBiRoleDesc;

    private String cBiRoleChn;

    private String cNotes;
}