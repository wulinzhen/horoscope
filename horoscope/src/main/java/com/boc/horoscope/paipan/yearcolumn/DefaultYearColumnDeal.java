package com.boc.horoscope.paipan.yearcolumn;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class DefaultYearColumnDeal implements YearColumnDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(paipanRunDTO.getLunarDate());
        int year =  calendar.get(Calendar.YEAR);
        int heavenlyNum = year % 10;
        int branchNum = year % 12;
        String heavenly = YearHeavenlyEnum.getByCode(heavenlyNum).getHeavenly();
        String branch = YearBranchEnum.getByCode(branchNum).getBranch();
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        if (eightCharacterDTO == null){
            eightCharacterDTO = new EightCharacterDTO();
            paipanRunDTO.setEightCharacterDTO(eightCharacterDTO);
        }
        paipanRunDTO.getEightCharacterDTO().setYearHeavenly(heavenly);
        paipanRunDTO.getEightCharacterDTO().setYearBranch(branch);
    }
}
