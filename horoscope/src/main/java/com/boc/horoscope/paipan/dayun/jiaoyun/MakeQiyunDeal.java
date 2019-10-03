package com.boc.horoscope.paipan.dayun.jiaoyun;

import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthHeavenlyEnum;
import com.boc.horoscope.paipan.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class MakeQiyunDeal implements QiyunDeal {

    @Autowired
    private QiyunDealUtil qiyunDealUtil;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        String dayHeav = paipanRunDTO.getEightCharacterDTO().getYearHeavenly();
        Date preDate = paipanRunDTO.getPreSolarTerm().getTermDate();
        if (paipanRunDTO.getCurrSolarTerm().getTermIndex()%2 == 0){
            preDate = paipanRunDTO.getCurrSolarTerm().getTermDate();
        }
        Date nextDate = paipanRunDTO.getNextSolarTerm().getTermDate();
        MonthHeavenlyEnum dayHeavenlyEnum = MonthHeavenlyEnum.getByHeavenly(dayHeav);
        int code = dayHeavenlyEnum.getCode();
        int sex = paipanRunDTO.getPaipanDTO().getSex();
        String termDateStr = null;
        if (code % 2 == sex%2){
            termDateStr = DateUtil.formatDate(nextDate,DateUtil.YYYY_MM_DD_HH_MM_SS);
        }else {
            termDateStr = DateUtil.formatDate(preDate,DateUtil.YYYY_MM_DD_HH_MM_SS);
        }
        String trueSunbirthDateTime = paipanRunDTO.getPaipanDTO().getTrueSunbirthDateTime();
        String[] qiyunDate = qiyunDealUtil.getQiyunDate(trueSunbirthDateTime,termDateStr);
        paipanRunDTO.setJiaoyunDate(qiyunDate[0]);
        paipanRunDTO.setQiyunDay(qiyunDate[1]);
    }
}
