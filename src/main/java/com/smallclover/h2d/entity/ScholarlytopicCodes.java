package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScholarlytopicCodes {
    private Integer cTopicCode;

    private String cTopicDesc;

    private String cTopicDescChn;

    private Integer cTopicTypeCode;

    private String cTopicTypeDesc;

    private String cTopicTypeDescChn;

    private Integer cSortorder;
}