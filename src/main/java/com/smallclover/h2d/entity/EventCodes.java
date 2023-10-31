package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventCodes {
    private Integer cEventCode;

    private String cEventNameChn;

    private String cEventName;

    private Integer cFyYr;

    private Integer cLyYr;

    private Integer cFyNhCode;

    private Integer cLyNhCode;

    private Integer cFyNhYr;

    private Integer cLyNhYr;

    private Boolean cFyIntercalary;

    private Integer cFyMonth;

    private Boolean cLyIntercalary;

    private Integer cLyMonth;

    private Integer cFyRange;

    private Integer cLyRange;

    private Integer cAddrId;

    private Integer cDy;

    private Integer cSource;

    private String cPages;

    private String cEventNotes;

    private String cSecondarySourceAuthor;
}