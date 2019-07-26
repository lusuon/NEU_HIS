package com.neu.his.requestBody.registration;

import lombok.Data;

import java.util.Date;

@Data
public class RegistrationBody {
    String pid;
    String name;
    int sex;
    Date birth;
    String address;
    Date seeDate;
    String noon;
    int dept;
    int doctor;
    int regCategory;
    int settlement;
    int needCaseBook;
    int operator;
}
