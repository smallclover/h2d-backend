package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntryTypes {
    private String cEntryType;

    private String cEntryTypeDesc;

    private String cEntryTypeDescChn;

    private String cEntryTypeParentId;

    private Double cEntryTypeLevel;

    private Double cEntryTypeSortorder;
}