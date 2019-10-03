package com.boc.horoscope.paipan.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class PaipanDTO implements Serializable{
    private static final long serialVersionUID = 1979060258209011861L;

    /**
     * 姓名
     */
    private String name;
    /**
     * 性别 1-男 2女
     */
    private Integer sex;
    /**
     * 出生时间-阳历
     */
    private String birthDateTime;
    /**
     * 出生时间是阴历还是阳历
     * 1-阳历
     * 2-阴历
     */
    private int sunOrlun;
    /**
     * 真太阳时
     */
    private String trueSunbirthDateTime;
    /**
     * 出生地
     */
    private BirthPlaceDTO birthPlace;
    /**
     * 是否是闰月
     */
    private boolean areLeapMonth;

}
