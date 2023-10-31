package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusTypes {
    private String cStatusTypeCode;

    private String cStatusTypeDesc;

    private String cStatusTypeChn;

    private String cStatusTypeParentCode;
}