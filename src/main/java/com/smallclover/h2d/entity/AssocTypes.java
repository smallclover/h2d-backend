package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssocTypes {
    private String cAssocTypeId;

    private String cAssocTypeDesc;

    private String cAssocTypeDescChn;

    private String cAssocTypeParentId;

    private Integer cAssocTypeLevel;

    private Integer cAssocTypeSortorder;

    private String cAssocTypeShortDesc;
}