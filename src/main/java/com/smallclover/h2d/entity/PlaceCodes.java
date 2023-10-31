package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlaceCodes {
    private Double cPlaceId;

    private String cPlace1990;

    private String cName;

    private String cNameChn;

    private Double xCoord;

    private Double yCoord;
}