package com.neu.his.requestBody.doctor;

import lombok.Data;

@Data
public class DiagnosisBody {
    String icd;
    String name;
    String time;
    int diseaseId;
    int caseId;
    int regId;
    int diagnosisType;
    int diagnosisClass;
}
