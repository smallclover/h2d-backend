package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TablesFields {
    private Integer rownum;

    private String dumptblnm;

    private String dumpfldnm;

    private String accesstblnm;

    private String accessfldnm;

    private String indexonfield;

    private String dataformat;

    private Boolean nullAllowed;

    private String foreignkey;

    private String foreignkeybasefield;
}