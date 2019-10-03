package com.boc.horoscope.paipan.canggan;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.stereotype.Component;

@Component("makeCangGanDeal")
public class MakeCangGanDeal implements CangGanDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String yearB = eightCharacterDTO.getYearBranch();
        String monthB = eightCharacterDTO.getMonthBranch();
        String dayB = eightCharacterDTO.getDayBranch();
        String hourB = eightCharacterDTO.getHourBranch();
        eightCharacterDTO.setYearBranchHevs(CangGanTable.getCangGan(yearB));
        eightCharacterDTO.setMonthBranchHevs(CangGanTable.getCangGan(monthB));
        eightCharacterDTO.setDayBranchHevs(CangGanTable.getCangGan(dayB));
        eightCharacterDTO.setHourBranchHevs(CangGanTable.getCangGan(hourB));

    }
}
