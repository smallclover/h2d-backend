package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextCodes {
    private Integer ttsSysno;

    private Integer cTextid;

    private String cTitleChn;

    private String cSuffixVersion;

    private String cTitle;

    private String cTitleTrans;

    private String cTextTypeId;

    private Integer cTextYear;

    private Integer cTextNhCode;

    private Integer cTextNhYear;

    private Integer cTextRangeCode;

    private String cPeriod;

    private Integer cBiblCatCode;

    private Integer cExtant;

    private Integer cTextCountry;

    private Integer cTextDy;

    private Integer cPubCountry;

    private Integer cPubDy;

    private String cPubYear;

    private Integer cPubNhCode;

    private Integer cPubNhYear;

    private Integer cPubRangeCode;

    private String cPubLoc;

    private String cPublisher;

    private String cPubNotes;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cUrlApi;

    private String cUrlApiCoda;

    private String cUrlHomepage;

    private String cNotes;

    private String cNumber;

    private String cCounter;

    private String cTitleAltChn;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}