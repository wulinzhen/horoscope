package com.boc.horoscope.paipan.yearcolumn;

public enum YearBranchEnum {
    ZI(4,"子"),
    CHOU(5,"丑"),
    YIN(6,"寅"),
    MAO(7,"卯"),
    CHEN(8,"辰"),
    SI(9,"巳"),
    WU(10,"午"),
    WEI(11,"未"),
    SHEN(12,"申"),
    YOU(1,"酉"),
    XU(2,"戌"),
    HAI(3,"亥"),
    ;



    private int code;

    private String branch;



    private YearBranchEnum(int code, String branch){
        this.code = code;
        this.branch = branch;
    }

    public static YearBranchEnum getByCode(int code){
        for (YearBranchEnum yearHeavenlyEnum : YearBranchEnum.values()) {
            if (yearHeavenlyEnum.code%12 == code%12){
                return yearHeavenlyEnum;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
