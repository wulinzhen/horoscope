package com.boc.horoscope.paipan.shierchangsheng;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.stereotype.Component;

@Component
public class DefaultShiErChangShengDeal implements ShiErChangShengDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String dayHeav = eightCharacterDTO.getDayHeavenly();

        String yearBranch = eightCharacterDTO.getYearBranch();
        String monthBranch = eightCharacterDTO.getMonthBranch();
        String dayBranch = eightCharacterDTO.getDayBranch();
        String hourBranch = eightCharacterDTO.getHourBranch();

        String yearChangSheng = ShiErChangShengTable.getChangsheng(dayHeav,yearBranch);
        String monthChangSheng = ShiErChangShengTable.getChangsheng(dayHeav,monthBranch);
        String dayChangSheng = ShiErChangShengTable.getChangsheng(dayHeav,dayBranch);
        String hourChangSheng = ShiErChangShengTable.getChangsheng(dayHeav,hourBranch);

        eightCharacterDTO.setYearChangSheng(yearChangSheng);
        eightCharacterDTO.setMonthChangSheng(monthChangSheng);
        eightCharacterDTO.setDayChangSheng(dayChangSheng);
        eightCharacterDTO.setHourChangSheng(hourChangSheng);


    }
}
