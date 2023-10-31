package com.smallclover.h2d.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

/**
 * 人物传记的基本信息
 * @author wangshun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Person implements Serializable {

    @Schema(name = "人物ID")
    private Integer cPersonid;
    @Schema(name = "姓名拼音")
    private String cName;

    // 中文姓名
    @Schema(name = "姓名（繁体中文）")
    private String cNameChn;
    // 指数年
    private Integer cIndexYear;
    private Boolean cFemale;
    private Integer cBirthyear;
    private Integer cDeathyear;
    // 字
//    @Schema(name = "字")
    private String altNameChn;
    // 在世始年备注
    private String cFlEyNotes;
    // 在世末年备注
    private String cFlLyNotes;
    // 出生年年号代码
    private Integer cByNhCode;
    // 出生年年号
    private Integer cByNhYear;
    // 死亡年年号代码
    private Integer cDyNhCode;
    // 死亡年年号
    private Integer cDyNhYear;

    private Integer cDeathAge;
    // 姓
    private String cSurname;
    // 中文姓
    private String cSurnameChn;
    // 名字
    private String cMingzi;
    // 中文名字
    private String cMingziChn;
    // 朝代
    private Integer cDy;

}
