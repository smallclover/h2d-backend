package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddrXy {
    private Integer cAddrId;

    private Double xCoord;

    private Double yCoord;

    private String cSourceReference;

    private Integer cSourceId;

    private String cNotes;
}