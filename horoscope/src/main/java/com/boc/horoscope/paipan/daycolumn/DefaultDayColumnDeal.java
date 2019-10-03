package com.boc.horoscope.paipan.daycolumn;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import com.boc.horoscope.paipan.monthcolumn.MonthHeavenlyEnum;
import com.boc.horoscope.paipan.util.DateUtil;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class DefaultDayColumnDeal implements DayColumnDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        String trueDate = paipanRunDTO.getPaipanDTO().getTrueSunbirthDateTime();
        Date date = DateUtil.parseDate(trueDate,DateUtil.YYYY_MM_DD_HH_MM);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(year,0,1,calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND));
        long betweenDays = Math.round((calendar.getTimeInMillis()-calendar2.getTimeInMillis())/
                (1000.0*3600.0*24.0)) + 1;

        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        if (hours < 1){
            betweenDays = betweenDays - 1;
        }else if (hours >= 23){
            betweenDays = betweenDays + 1;
        }
        Long mod = ((year - 1)*5+(year -1)/4+betweenDays)%60;
        int modInt = mod.intValue();
        int dayHevenly = modInt%10;
        int dayBrnch = (modInt-2)%12;
        String dayHy = MonthHeavenlyEnum.getByCode(dayHevenly).getHeavenly();
        String dayBr = MonthBranchEnum.getByCode(dayBrnch).getBranch();
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        if (eightCharacterDTO == null){
            eightCharacterDTO = new EightCharacterDTO();
            paipanRunDTO.setEightCharacterDTO(eightCharacterDTO);
        }
        eightCharacterDTO.setDayBranch(dayBr);
        eightCharacterDTO.setDayHeavenly(dayHy);
    }
}
