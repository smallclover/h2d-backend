package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusData {
    private Integer ttsSysno;

    private Integer cPersonid;

    private Integer cSequence;

    private Integer cStatusCode;

    private Integer cFirstyear;

    private Integer cFyNhCode;

    private Integer cFyNhYear;

    private Integer cFyRange;

    private Integer cLastyear;

    private Integer cLyNhCode;

    private Integer cLyNhYear;

    private Integer cLyRange;

    private String cSupplement;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}