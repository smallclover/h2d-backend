package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EthnicityTribeCodes {
    private Integer cEthnicityCode;

    private Integer cGroupCode;

    private Integer cSubgroupCode;

    private Integer cAltnameCode;

    private String cNameChn;

    private String cName;

    private String cEthnoLegalCat;

    private String cRomanized;

    private String cSurname;

    private String cNotes;

    private String jiutangshu;

    private String xintangshu;

    private String jiuwudaishi;

    private String xinwudaishi;

    private String songshi;

    private String liaoshi;

    private String jinshi;

    private String yuanshi;

    private String mingshi;

    private String qingshigao;

    private Integer cSortorder;
}