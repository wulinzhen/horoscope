package com.boc.horoscope.paipan.dayun;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class DaYunDTO {
    private String dayunDate;
    private String heavGod;
    private String heavenly;
    private String branch;
    private List<String> cangGans;
    private List<String> cangGanGods;
    private int age;
    private List<String> liuNian;
}
