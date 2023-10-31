package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextBiblcatCodes {
    private Integer cTextCatCode;

    private String cTextCatDesc;

    private String cTextCatDescChn;

    private String cTextCatPinyin;

    private String cTextCatParentId;

    private String cTextCatLevel;

    private Integer cTextCatSortorder;
}