package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddrPlaceData {
    private Integer cAddrId;

    private Integer cPlaceId;

    private Integer cFirstyear;

    private Integer cLastyear;
}