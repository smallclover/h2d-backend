package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentTypeCodes {
    private Integer cApptTypeCode;

    private String cApptTypeDescChn;

    private String cApptTypeDesc;

    private String cApptTypeDescChnAlt;

    private String cApptTypeDescAlt;

    private Integer check;
}