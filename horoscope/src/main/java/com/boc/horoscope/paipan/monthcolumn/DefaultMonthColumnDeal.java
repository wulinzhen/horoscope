package com.boc.horoscope.paipan.monthcolumn;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.stereotype.Component;

@Component
public class DefaultMonthColumnDeal implements MonthColumnDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        int solarTermIdx = paipanRunDTO.getSolarTermIdx();
        MonthBranchEnum monthBranchEnum = SolarTermMonthBranch.getBySolarTermIdx(solarTermIdx);
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        if (eightCharacterDTO == null){
            eightCharacterDTO = new EightCharacterDTO();
            paipanRunDTO.setEightCharacterDTO(eightCharacterDTO);
        }
        eightCharacterDTO.setMonthBranch(monthBranchEnum.getBranch());
        String monthHevenly = MonthHevenlyUtil.getMonthHevenly(eightCharacterDTO.getYearHeavenly(),
                monthBranchEnum.getBranch() );
        eightCharacterDTO.setMonthHeavenly(monthHevenly);
    }
}
