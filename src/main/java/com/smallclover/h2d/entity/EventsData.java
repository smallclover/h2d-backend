package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventsData {
    private Integer cPersonid;

    private Integer cSequence;

    private Integer cEventRecordId;

    private Integer cEventCode;

    private String cRole;

    private Integer cYear;

    private Integer cNhCode;

    private Integer cNhYear;

    private Integer cYrRange;

    private Boolean cIntercalary;

    private Integer cMonth;

    private Integer cDay;

    private Integer cDayGanzhi;

    private Integer cAddrId;

    private Integer cSource;

    private String cPages;

    private String cSecondarySourceAuthor;

    private String cEvent;

    private String cNotes;

    private Integer ttsSysno;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;
}