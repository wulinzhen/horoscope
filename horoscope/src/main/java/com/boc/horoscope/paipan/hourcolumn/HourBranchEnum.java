package com.boc.horoscope.paipan.hourcolumn;

public enum HourBranchEnum {
    ZI(1,"子"),
    CHOU(2,"丑"),
    YIN(3,"寅"),
    MAO(4,"卯"),
    CHEN(5,"辰"),
    SI(6,"巳"),
    WU(7,"午"),
    WEI(8,"未"),
    SHEN(9,"申"),
    YOU(10,"酉"),
    XU(11,"戌"),
    HAI(12,"亥"),
    ;



    private int code;

    private String branch;


    private HourBranchEnum(int code, String branch){
        this.code = code;
        this.branch = branch;
    }

    public static HourBranchEnum getByCode(int code){
        for (HourBranchEnum yearHeavenlyEnum : HourBranchEnum.values()) {
            if (yearHeavenlyEnum.code%12 == code%12){
                return yearHeavenlyEnum;
            }
        }
        return null;
    }

    public static HourBranchEnum getByBranch(String branch){
        for (HourBranchEnum yearHeavenlyEnum : HourBranchEnum.values()) {
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
