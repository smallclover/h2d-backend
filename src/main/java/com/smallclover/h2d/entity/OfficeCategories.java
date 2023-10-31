package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfficeCategories {
    private Integer cOfficeCategoryId;

    private String cCategoryDesc;

    private String cCategoryDescChn;

    private String cNotes;
}