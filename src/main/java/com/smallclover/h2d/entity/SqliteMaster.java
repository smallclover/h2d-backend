package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SqliteMaster {
    private String type;

    private String name;

    private String tblName;

    private Integer rootpage;

    private String sql;
}