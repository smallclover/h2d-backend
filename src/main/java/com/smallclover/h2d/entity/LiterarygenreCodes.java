package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LiterarygenreCodes {
    private Integer cLitGenreCode;

    private String cLitGenreDesc;

    private String cLitGenreDescChn;

    private Integer cSortorder;
}