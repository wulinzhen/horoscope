package com.boc.horoscope.paipan.monthcolumn;

public enum MonthBranchEnum {
    ZI(11,"子"),
    CHOU(12,"丑"),
    YIN(1,"寅"),
    MAO(2,"卯"),
    CHEN(3,"辰"),
    SI(4,"巳"),
    WU(5,"午"),
    WEI(6,"未"),
    SHEN(7,"申"),
    YOU(8,"酉"),
    XU(9,"戌"),
    HAI(10,"亥"),
    ;



    private int code;

    private String branch;


    private MonthBranchEnum(int code, String branch){
        this.code = code;
        this.branch = branch;
    }

    public static MonthBranchEnum getByCode(int code){
        for (MonthBranchEnum yearHeavenlyEnum : MonthBranchEnum.values()) {
            if (yearHeavenlyEnum.code%12 == code%12){
                return yearHeavenlyEnum;
            }
        }
        return null;
    }

    public static MonthBranchEnum getByBranch(String branch){
        for (MonthBranchEnum yearHeavenlyEnum : MonthBranchEnum.values()) {
            if (yearHeavenlyEnum.branch.equals(branch)){
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
