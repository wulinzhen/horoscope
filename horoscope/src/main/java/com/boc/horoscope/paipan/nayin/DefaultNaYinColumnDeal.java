package com.boc.horoscope.paipan.nayin;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;

@Component
public class DefaultNaYinColumnDeal implements NaYinColumnDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String yearColumn = eightCharacterDTO.getYearHeavenly()+eightCharacterDTO.getYearBranch();
        String monthColumn = eightCharacterDTO.getMonthHeavenly()+eightCharacterDTO.getMonthBranch();
        String dayColumn = eightCharacterDTO.getDayHeavenly()+eightCharacterDTO.getDayBranch();
        String hourColumn = eightCharacterDTO.getHourHeavenly()+eightCharacterDTO.getHourBranch();

        NaYinEnum yearNaYinEnum = NaYinEnum.getByCodeOrMsg(yearColumn);
        NaYinEnum monthNaYinEnum = NaYinEnum.getByCodeOrMsg(monthColumn);
        NaYinEnum dayNaYinEnum = NaYinEnum.getByCodeOrMsg(dayColumn);
        NaYinEnum hourNaYinEnum = NaYinEnum.getByCodeOrMsg(hourColumn);

        eightCharacterDTO.setYearNaYin(yearNaYinEnum.getNanYin());
        eightCharacterDTO.setMonthNaYin(monthNaYinEnum.getNanYin());
        eightCharacterDTO.setDayNaYin(dayNaYinEnum.getNanYin());
        eightCharacterDTO.setHourNaYin(hourNaYinEnum.getNanYin());

    }
}
