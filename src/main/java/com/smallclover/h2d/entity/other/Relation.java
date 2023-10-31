package com.smallclover.h2d.entity.other;

import lombok.Data;

@Data
public class Relation {
    private Integer mPersonId;
    private String mPersonChn;
    private Integer sPersonId;
    private String sPersonChn;
    private String assocDescChn;
    private String assocTypeDescChn;
}
