package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PossessionData {
    private Integer cPersonid;

    private Integer cPossessionRecordId;

    private Integer cSequence;

    private Integer cPossessionActCode;

    private String cPossessionDesc;

    private String cPossessionDescChn;

    private String cQuantity;

    private Integer cMeasureCode;

    private Integer cPossessionYr;

    private Integer cPossessionNhCode;

    private Integer cPossessionNhYr;

    private Integer cPossessionYrRange;

    private Integer cAddrId;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}