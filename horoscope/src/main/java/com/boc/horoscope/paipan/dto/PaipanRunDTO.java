package com.boc.horoscope.paipan.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.boc.horoscope.horos.po.CnSolarTerm;
import com.boc.horoscope.paipan.dayun.DaYunDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
