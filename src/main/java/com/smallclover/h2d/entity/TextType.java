package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextType {
    private String cTextTypeCode;

    private String cTextTypeDesc;

    private String cTextTypeDescChn;

    private String cTextTypeParentId;

    private Integer cTextTypeLevel;

    private Integer cTextTypeSortorder;
}