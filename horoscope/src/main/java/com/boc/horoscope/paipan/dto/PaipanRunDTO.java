package com.boc.horoscope.paipan.dto;

import com.boc.horoscope.horos.po.CnSolarTerm;
import com.boc.horoscope.paipan.dayun.DaYunDTO;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@ToString
public class PaipanRunDTO implements Serializable {
    private static final long serialVersionUID = -5586305515735593683L;

    /**
     * 排盘基础dto
     */
    private PaipanDTO paipanDTO;

    /**
     * 八字dto
     */
    private EightCharacterDTO eightCharacterDTO;

    private Date lunarDate;

    private int solarYear;

    private int solarTermIdx;

    private CnSolarTerm preSolarTerm;

    private CnSolarTerm currSolarTerm;

    private CnSolarTerm nextSolarTerm;

    private String qiyunDay;

    private String jiaoyunDate;

    private List<DaYunDTO> daYunDTOS;




}
