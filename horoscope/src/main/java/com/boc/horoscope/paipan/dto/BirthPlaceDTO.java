package com.boc.horoscope.paipan.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class  BirthPlaceDTO  implements Serializable {
    private static final long serialVersionUID = -6534052552338898002L;
    /**
     * 省，直辖市
     */
    private String province;
    private String provinceName;

    /**
     * 市，直辖市
     */
    private String city;
    private String cityName;

    /**
     * 区，县
     */
    private String area;
    private String areaName;



}
