package com.boc.horoscope.paipan.yearcolumn;

public enum YearHeavenlyEnum {
    JIA(4,"甲"),
    YI(5,"乙"),
    BING(6,"丙"),
    DING(7,"丁"),
    WU(8,"戊"),
    JI(9,"己"),
    GENG(10,"庚"),
    XIN(1,"辛"),
    REN(2,"壬"),
    GUI(3,"癸"),
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

    public void setHeavenly(String heavenly) {
        this.heavenly = heavenly;
    }

    private int code;

    private String heavenly;



    private YearHeavenlyEnum(int code,String yearHeavenly){
        this.code = code;
        this.heavenly = yearHeavenly;
    }

    public static YearHeavenlyEnum getByCode(int code){
        for (YearHeavenlyEnum yearHeavenlyEnum : YearHeavenlyEnum.values()) {
            if (yearHeavenlyEnum.code%10 == code%10){
                return yearHeavenlyEnum;
            }
        }
        return null;
    }
}
