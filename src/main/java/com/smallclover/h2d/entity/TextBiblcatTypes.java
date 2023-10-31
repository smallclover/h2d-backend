package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextBiblcatTypes {
    private String cTextCatTypeId;

    private String cTextCatTypeDesc;

    private String cTextCatTypeDescChn;

    private String cTextCatTypeParentId;

    private Integer cTextCatTypeLevel;

    private Integer cTextCatTypeSortorder;
}