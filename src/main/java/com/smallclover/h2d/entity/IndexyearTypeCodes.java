package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IndexyearTypeCodes {
    private String cIndexYearTypeCode;

    private String cIndexYearTypeDesc;

    private String cIndexYearTypeHz;

    private String cNotes;
}