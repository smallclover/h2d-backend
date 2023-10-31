package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostedToAddrData {
    private Integer ttsSysno;

    private Integer cPostingId;

    private Integer cPersonid;

    private Integer cOfficeId;

    private Integer cAddrId;

    private Integer cPostingIdOld;
}