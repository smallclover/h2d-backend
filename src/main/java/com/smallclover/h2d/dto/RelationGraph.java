package com.smallclover.h2d.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RelationGraph {

    private List<Category> categories;
    private List<Node> nodes;
    private List<Link> links;

}
