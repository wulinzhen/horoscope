package com.boc.horoscope.paipan.shierchangsheng;

import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;

public enum ShiErChangShengEnum {
    长生(1,"长生"),
    沐浴(2,"沐浴"),
    冠带(3,"冠带"),
    建禄(4,"建禄"),
    帝旺(5,"帝旺"),
    衰(6,"衰"),
    病(7,"病"),
    死(8,"死"),
    墓(9,"墓"),
    绝(10,"绝"),
    胎(11,"胎"),
    养(12,"养"),
    ;

    private int code;

    private String shiErChangSheng;

    public int getCode() {
        return code;
    }

    public String getShiErChangSheng() {
        return shiErChangSheng;
    }

    private ShiErChangShengEnum(int code, String shiErChangSheng){
        this.code = code;
        this.shiErChangSheng = shiErChangSheng;
    }

    public static ShiErChangShengEnum getByCode(int code){
        for (ShiErChangShengEnum shiErChangShengEnum : ShiErChangShengEnum.values()) {
            if (shiErChangShengEnum.code%12 == code%12){
                return shiErChangShengEnum;
            }
        }
        return null;
    }
}
