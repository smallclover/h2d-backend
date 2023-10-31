package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssocData {
    private Integer ttsSysno;

    private Integer cAssocCode;

    private Integer cPersonid;

    private Integer cKinCode;

    private Integer cKinId;

    private Integer cAssocId;

    private Integer cAssocKinCode;

    private Integer cAssocKinId;

    private Integer cTertiaryPersonid;

    private String cTertiaryTypeNotes;

    private Integer cAssocCount;

    private Integer cSequence;

    private Integer cAssocYear;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private Integer cAssocNhCode;

    private Integer cAssocNhYear;

    private Integer cAssocRange;

    private Integer cAddrId;

    private Integer cLitgenreCode;

    private Integer cOccasionCode;

    private Integer cTopicCode;

    private Integer cInstCode;

    private Integer cInstNameCode;

    private String cTextTitle;

    private Integer cAssocClaimerId;

    private Boolean cAssocIntercalary;

    private Integer cAssocMonth;

    private Integer cAssocDay;

    private Integer cAssocDayGz;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}