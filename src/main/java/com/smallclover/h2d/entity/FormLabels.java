package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormLabels {
    private String cForm;

    private Integer cLabelId;

    private String cEnglish;

    private String cJianti;

    private String cFanti;
}