package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TextInstanceData {
    private Integer ttsSysno;

    private Integer cTextid;

    private Integer cTextEditionId;

    private Integer cTextInstanceId;

    private String cInstanceTitleChn;

    private String cInstanceTitle;

    private String cInstanceTitleTrans;

    private Integer cPartOfInstance;

    private String cPartOfInstanceNotes;

    private Integer cPubCountry;

    private Integer cPubDy;

    private String cPubYear;

    private Integer cPubNhCode;

    private Integer cPubNhYear;

    private Integer cPubRangeCode;

    private String cPubLoc;

    private String cPublisher;

    private String cPrint;

    private String cPubNotes;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private Integer cExtant;

    private String cUrlApi;

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