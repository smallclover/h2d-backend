package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntryData {
    private Integer ttsSysno;

    private Integer cPersonid;

    private Integer cEntryCode;

    private Integer cSequence;

    private String cExamRank;

    private Integer cKinCode;

    private Integer cKinId;

    private Integer cAssocCode;

    private Integer cAssocId;

    private Integer cYear;

    private Integer cAge;

    private Integer cNianhaoId;

    private Integer cEntryNhYear;

    private Integer cEntryRange;

    private Integer cInstCode;

    private Integer cInstNameCode;

    private String cExamField;

    private Integer cEntryAddrId;

    private Integer cParentalStatus;

    private Integer cAttemptCount;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private String cPostingNotes;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}