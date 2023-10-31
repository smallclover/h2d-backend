package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TablesFieldsChanges {
    private String tablename;

    private String fieldname;

    private String change;

    private String changedate;

    private String changenotes;
}