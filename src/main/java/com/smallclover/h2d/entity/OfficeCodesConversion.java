package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfficeCodesConversion {
    private Integer cOfficeIdBackup;

    private String cOfficeChnBackup;

    private Integer cOfficeId;

    private String cOfficeChn;
}