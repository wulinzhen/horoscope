package com.boc.horoscope.paipan.monthcolumn;

public enum MonthHeavenlyEnum {
    JIA(1,"甲"),
    YI(2,"乙"),
    BING(3,"丙"),
    DING(4,"丁"),
    WU(5,"戊"),
    JI(6,"己"),
    GENG(7,"庚"),
    XIN(8,"辛"),
    REN(9,"壬"),
    GUI(10,"癸"),
    ;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getHeavenly() {
        return heavenly;
    }

    public void setYearHeavenly(String heavenly) {
        this.heavenly = heavenly;
    }

    private int code;

    private String heavenly;



    private MonthHeavenlyEnum(int code, String heavenly){
        this.code = code;
        this.heavenly = heavenly;
    }

    public static MonthHeavenlyEnum getByCode(int code){
        for (MonthHeavenlyEnum yearHeavenlyEnum : MonthHeavenlyEnum.values()) {
            if (yearHeavenlyEnum.code%10 == code%10){
                return yearHeavenlyEnum;
            }
        }
        return null;
    }

    public static MonthHeavenlyEnum getByHeavenly(String heavenly){
        for (MonthHeavenlyEnum yearHeavenlyEnum : MonthHeavenlyEnum.values()) {
            if (yearHeavenlyEnum.heavenly.equals(heavenly)){
                return yearHeavenlyEnum;
            }
        }
        return null;
    }
}
