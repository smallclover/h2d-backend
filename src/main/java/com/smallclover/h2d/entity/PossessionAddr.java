package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PossessionAddr {
    private Integer cPossessionRecordId;

    private Integer cPersonid;

    private Integer cAddrId;
}