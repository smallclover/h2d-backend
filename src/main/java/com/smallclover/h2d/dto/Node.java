package com.smallclover.h2d.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Node {
    private Integer id;

    private Integer category;

    private String name;

    private String label;

    private Integer symbolSize;

//    private Integer x;
//
//    private Integer y;
}
