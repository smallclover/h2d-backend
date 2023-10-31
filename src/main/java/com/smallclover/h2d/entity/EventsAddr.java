package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventsAddr {
    private Integer cEventRecordId;

    private Integer cPersonid;

    private Integer cAddrId;

    private Integer cYear;

    private Integer cNhCode;

    private Integer cNhYear;

    private Integer cYrRange;

    private Boolean cIntercalary;

    private Integer cMonth;

    private Integer cDay;

    private Integer cDayGanzhi;
}