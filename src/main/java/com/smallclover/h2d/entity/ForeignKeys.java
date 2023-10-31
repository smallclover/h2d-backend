package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ForeignKeys {
    private String accesstblnm;

    private String accessfldnm;

    private String foreignkey;

    private String foreignkeybasefield;

    private String fkstring;

    private String fkname;

    private Integer skip;

    private String indexonfield;

    private String dataformat;

    private Boolean nullAllowed;
}