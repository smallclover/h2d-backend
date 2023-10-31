package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialInstitutionAddrTypes {
    private Integer cInstAddrTypeCode;

    private String cInstAddrTypeDesc;

    private String cInstAddrTypeChn;

    private String cNotes;
}