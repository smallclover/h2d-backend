package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BiogSourceData {
    private Integer cPersonid;

    private Integer cTextid;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private Boolean cMainSource;

    private Boolean cSelfBio;
}