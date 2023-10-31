package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfficeTypeTree {
    private String cOfficeTypeNodeId;

    private String cTtsNodeId;

    private String cOfficeTypeDesc;

    private String cOfficeTypeDescChn;

    private String cParentId;
}