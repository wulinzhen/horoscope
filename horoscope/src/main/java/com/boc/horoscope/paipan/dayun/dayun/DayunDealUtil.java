package com.boc.horoscope.paipan.dayun.dayun;

import com.boc.horoscope.horos.po.HsFiveElementRelation;
import com.boc.horoscope.paipan.canggan.CangGanTable;
import com.boc.horoscope.paipan.dayun.DaYunDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import com.boc.horoscope.paipan.monthcolumn.MonthHeavenlyEnum;
import com.boc.horoscope.paipan.tengod.HevenlyRelationGraph;
import com.boc.horoscope.paipan.util.DateUtil;
import com.boc.horoscope.paipan.yearcolumn.YearBranchEnum;
import com.boc.horoscope.paipan.yearcolumn.YearHeavenlyEnum;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class DayunDealUtil {

    @Autowired
    private HevenlyRelationGraph hevenlyRelationGraph;

    public void computeYearColumn(PaipanRunDTO paipanRunDTO){
        List<DaYunDTO> daYunDTOs = paipanRunDTO.getDaYunDTOS();
        String dayHeavenly = paipanRunDTO.getEightCharacterDTO().getDayHeavenly();
        MonthHeavenlyEnum dayHeavenlyEnum = MonthHeavenlyEnum.getByHeavenly(dayHeavenly);
        int dayHeavCode = dayHeavenlyEnum.getCode();
        String birthDate = paipanRunDTO.getPaipanDTO().getTrueSunbirthDateTime();
        int sex = paipanRunDTO.getPaipanDTO().getSex();
        String monthHeav = paipanRunDTO.getEightCharacterDTO().getMonthHeavenly();
        String monthBran = paipanRunDTO.getEightCharacterDTO().getMonthBranch();
        //顺排或者逆排 true-顺排 false-逆排
        boolean preOrAfter = dayHeavCode%2 == sex%2;
        for (int i = 0; i < daYunDTOs.size(); i++) {
            DaYunDTO daYunDTO= daYunDTOs.get(i);
            String heavenly = getNextHeavenly(monthHeav,i+1,preOrAfter);
            String branch = getNextBranch(monthBran,i+1,preOrAfter);
            List<String> cangGans = CangGanTable.getCangGan(branch);
            daYunDTO.setHeavenly(heavenly);
            daYunDTO.setBranch(branch);
            daYunDTO.setCangGans(cangGans);
            HsFiveElementRelation yeayRel =
                    hevenlyRelationGraph.getRelation(dayHeavenly+heavenly);
            daYunDTO.setHeavGod(yeayRel.getTenGod());
            List<String> cangGanGods = new ArrayList<>();
            cangGans.stream().forEach(s -> {
                HsFiveElementRelation yeayRel2 =
                        hevenlyRelationGraph.getRelation(dayHeavenly+s);
                cangGanGods.add(yeayRel2.getTenGod());
            });
            daYunDTO.setCangGanGods(cangGanGods);
            daYunDTO.setAge(getAge(birthDate,daYunDTO.getDayunDate()));
        }
    }

    private String getNextBranch(String currBranch,int nextIdx,boolean preOrAfter){
        MonthBranchEnum monthBranchEnum = MonthBranchEnum.getByBranch(currBranch);
        int code = monthBranchEnum.getCode();
        int tarCode =0;
        if (preOrAfter){
            tarCode = code + nextIdx;
        }else {
            tarCode = code + 12 - nextIdx;
        }
        MonthBranchEnum tarBranch = MonthBranchEnum.getByCode(tarCode);
        return tarBranch.getBranch();
    }

    private String getNextHeavenly(String currHeavenly,int nextIdx,boolean preOrAfter){
        MonthHeavenlyEnum monthHeavenlyEnum = MonthHeavenlyEnum.getByHeavenly(currHeavenly);
        int code = monthHeavenlyEnum.getCode();
        int tarCode =0;
        if (preOrAfter){
            tarCode = code + nextIdx;
        }else {
            tarCode = code + 10 - nextIdx;
        }
        MonthHeavenlyEnum tarHeavenly = MonthHeavenlyEnum.getByCode(tarCode);
        return tarHeavenly.getHeavenly();
    }

    private int getAge(String birthDate,String currDate){
        Date birthDate1 = DateUtil.parseDate(birthDate,DateUtil.YYYY_MM_DD_HH_MM);
        Date currDate1 = DateUtil.parseDate(currDate,DateUtil.YYYY_MM_DD_HH_MM);
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTime(birthDate1);
        Calendar currDateCalendar = Calendar.getInstance();
        currDateCalendar.setTime(currDate1);
        int birthYear = birthCalendar.get(Calendar.YEAR);
        int currYear = currDateCalendar.get(Calendar.YEAR);
        return Math.abs(currYear-birthYear);
    }
}
