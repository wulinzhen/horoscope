package com.boc.horoscope.paipan.tengod;

import com.boc.horoscope.horos.po.HsFiveElementRelation;
import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("branchTenGodDeal")
public class BranchTenGodDeal implements TenGodDeal {

    @Autowired
    private HevenlyRelationGraph hevenlyRelationGraph;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        List<String> yearBranchHevs = eightCharacterDTO.getYearBranchHevs();
        List<String> monthBranchHevs = eightCharacterDTO.getMonthBranchHevs();
        String dayHeavenly = eightCharacterDTO.getDayHeavenly();
        List<String> dayBranchHevs = eightCharacterDTO.getDayBranchHevs();
        List<String> hourBranchHevs = eightCharacterDTO.getHourBranchHevs();
        List<String> yearBranchHevsGod = new ArrayList<>();
        List<String> monthBranchHevsGod = new ArrayList<>();
        List<String> dayBranchHevsGod = new ArrayList<>();
        List<String> hourBranchHevsGod = new ArrayList<>();
        yearBranchHevs.stream().forEach(s -> {
            HsFiveElementRelation hsFiveElementRelation =
                    hevenlyRelationGraph.getRelation(dayHeavenly+s);
            yearBranchHevsGod.add(hsFiveElementRelation.getTenGod());
        });
        monthBranchHevs.stream().forEach(s -> {
            HsFiveElementRelation hsFiveElementRelation =
                    hevenlyRelationGraph.getRelation(dayHeavenly+s);
            monthBranchHevsGod.add(hsFiveElementRelation.getTenGod());
        });
        dayBranchHevs.stream().forEach(s -> {
            HsFiveElementRelation hsFiveElementRelation =
                    hevenlyRelationGraph.getRelation(dayHeavenly+s);
            dayBranchHevsGod.add(hsFiveElementRelation.getTenGod());
        });
        hourBranchHevs.stream().forEach(s -> {
            HsFiveElementRelation hsFiveElementRelation =
                    hevenlyRelationGraph.getRelation(dayHeavenly+s);
            hourBranchHevsGod.add(hsFiveElementRelation.getTenGod());
        });
        eightCharacterDTO.setYearBranchHevsGod(yearBranchHevsGod);
        eightCharacterDTO.setMonthBranchHevsGod(monthBranchHevsGod);
        eightCharacterDTO.setDayBranchHevsGod(dayBranchHevsGod);
        eightCharacterDTO.setHourBranchHevsGod(hourBranchHevsGod);
    }
}
