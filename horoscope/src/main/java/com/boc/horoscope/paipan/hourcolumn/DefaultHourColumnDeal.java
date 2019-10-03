package com.boc.horoscope.paipan.hourcolumn;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import com.boc.horoscope.paipan.monthcolumn.MonthHevenlyUtil;
import com.boc.horoscope.paipan.util.DateUtil;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class DefaultHourColumnDeal implements HourColumnDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String dayHy = eightCharacterDTO.getDayHeavenly();
        String trueDateStr = paipanRunDTO.getPaipanDTO().getTrueSunbirthDateTime();
        Date date = DateUtil.parseDate(trueDateStr,DateUtil.YYYY_MM_DD_HH_MM);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int hoursIdx = ((hours + 3)/2)%12;
        HourBranchEnum hourBranchEnum = HourBranchEnum.getByCode(hoursIdx);
        String hourBr = hourBranchEnum.getBranch();
        String houHev = HourHevenlyUtil.getHourHevenly(dayHy,hourBr);
        eightCharacterDTO.setHourBranch(hourBr);
        eightCharacterDTO.setHourHeavenly(houHev);
    }
}
