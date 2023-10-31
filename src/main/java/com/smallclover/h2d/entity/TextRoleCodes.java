package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextRoleCodes {
    private Integer cRoleId;

    private String cRoleDesc;

    private String cRoleDescChn;
}