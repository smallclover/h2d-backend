package com.smallclover.h2d.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Link {
    private String source;
    private String target;
    private String label;
}
