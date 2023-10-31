package com.smallclover.h2d.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BiogMain {
    private Integer ttsSysno;

    private Integer cPersonid;

    private String cName;

    private String cNameChn;

    private Integer cIndexYear;

    private String cIndexYearTypeCode;

    private Integer cIndexYearSourceId;

    private Boolean cFemale;

    private Integer cIndexAddrId;

    private Integer cIndexAddrTypeCode;

    private Integer cEthnicityCode;

    private Integer cHouseholdStatusCode;

    private String cTribe;

    private Integer cBirthyear;

    private Integer cByNhCode;

    private Integer cByNhYear;

    private Integer cByRange;

    private Integer cDeathyear;

    private Integer cDyNhCode;

    private Integer cDyNhYear;

    private Integer cDyRange;

    private Integer cDeathAge;

    private Integer cDeathAgeRange;

    private Integer cFlEarliestYear;

    private Integer cFlEyNhCode;

    private Integer cFlEyNhYear;

    private String cFlEyNotes;

    private Integer cFlLatestYear;

    private Integer cFlLyNhCode;

    private Integer cFlLyNhYear;

    private String cFlLyNotes;

    private String cSurname;

    private String cSurnameChn;

    private String cMingzi;

    private String cMingziChn;

    private Integer cDy;

    private Integer cChoronymCode;

    private String cNotes;

    private Boolean cByIntercalary;

    private Boolean cDyIntercalary;

    private Integer cByMonth;

    private Integer cDyMonth;

    private Integer cByDay;

    private Integer cDyDay;

    private Integer cByDayGz;

    private Integer cDyDayGz;

    private String cSurnameProper;

    private String cMingziProper;

    private String cNameProper;

    private String cSurnameRm;

    private String cMingziRm;

    private String cNameRm;

    private String cCreatedBy;

    private String cCreatedDate;

    private String cModifiedBy;

    private String cModifiedDate;

    private Boolean cSelfBio;
}