package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostedToOfficeData {
    private Integer ttsSysno;

    private Integer cPersonid;

    private Integer cOfficeId;

    private Integer cPostingId;

    private Integer cPostingIdOld;

    private Integer cSequence;

    private Integer cFirstyear;

    private Integer cFyNhCode;

    private Integer cFyNhYear;

    private Integer cFyRange;

    private Integer cLastyear;

    private Integer cLyNhCode;

    private Integer cLyNhYear;

    private Integer cLyRange;

    private Integer cApptTypeCode;

    private Integer cAssumeOfficeCode;

    private Integer cInstCode;

    private Integer cInstNameCode;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private Integer cOfficeIdBackup;

    private Integer cOfficeCategoryId;

    private Boolean cFyIntercalary;

    private Integer cFyMonth;

    private Boolean cLyIntercalary;

    private Integer cLyMonth;

    private Integer cFyDay;

    private Integer cLyDay;

    private Integer cFyDayGz;

    private Integer cLyDayGz;

    private Integer cDy;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}