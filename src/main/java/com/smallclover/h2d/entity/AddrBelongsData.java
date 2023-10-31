package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddrBelongsData {
    private Integer cAddrId;

    private Integer cBelongsTo;

    private Integer cFirstyear;

    private Integer cLastyear;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;
}