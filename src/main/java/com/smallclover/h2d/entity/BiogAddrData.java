package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BiogAddrData {
    private Integer ttsSysno;

    private Integer cPersonid;

    private Integer cAddrId;

    private Integer cAddrType;

    private Integer cSequence;

    private Integer cFirstyear;

    private Integer cLastyear;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cNotes;

    private Integer cFyNhCode;

    private Integer cLyNhCode;

    private Integer cFyNhYear;

    private Integer cLyNhYear;

    private Integer cFyRange;

    private Integer cLyRange;

    private Integer cNatal;

    private Boolean cFyIntercalary;

    private Boolean cLyIntercalary;

    private Integer cFyMonth;

    private Integer cLyMonth;

    private Integer cFyDay;

    private Integer cLyDay;

    private Integer cFyDayGz;

    private Integer cLyDayGz;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;

    private Integer cDelete;
}