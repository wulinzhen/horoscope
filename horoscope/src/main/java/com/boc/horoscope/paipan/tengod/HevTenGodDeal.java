package com.boc.horoscope.paipan.tengod;

import com.boc.horoscope.horos.po.HsFiveElementRelation;
import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hevTenGodDeal")
public class HevTenGodDeal implements TenGodDeal {

    @Autowired
    private HevenlyRelationGraph hevenlyRelationGraph;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String yearHeavenly = eightCharacterDTO.getYearHeavenly();
        String monthHeavenly = eightCharacterDTO.getMonthHeavenly();
        String dayHeavenly = eightCharacterDTO.getDayHeavenly();
        String hourHeavenly = eightCharacterDTO.getHourHeavenly();
        HsFiveElementRelation yeayRel =
                hevenlyRelationGraph.getRelation(dayHeavenly+yearHeavenly);
        HsFiveElementRelation monthRel =
                hevenlyRelationGraph.getRelation(dayHeavenly+monthHeavenly);
        HsFiveElementRelation hourRel =
                hevenlyRelationGraph.getRelation(dayHeavenly+hourHeavenly);
        eightCharacterDTO.setYearHevGod(yeayRel.getTenGod());
        eightCharacterDTO.setMonthHevGod(monthRel.getTenGod());
        eightCharacterDTO.setDayHevGod("日元");
        eightCharacterDTO.setHourHevGod(hourRel.getTenGod());
    }
}
