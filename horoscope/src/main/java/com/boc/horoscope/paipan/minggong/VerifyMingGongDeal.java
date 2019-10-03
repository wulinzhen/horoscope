package com.boc.horoscope.paipan.minggong;

import com.boc.horoscope.horos.po.CnSolarTerm;
import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import com.boc.horoscope.paipan.util.DateUtil;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * 正月太阳在子宫，雨水后第五天进入亥宫，以二月安命;
 * 二月太阳在亥宫，春分后第七天进入戌宫，以三月安命;
 * 三月太阳在戌宫，谷雨后第九天进入酉宫，以四月安命;
 * 四月太阳在酉宫，小满后第十天进入申宫，以五月安命;
 * 五月太阳在申宫，夏至后第九天进入未宫，以六月安命;
 * 六月太阳在未宫，大暑后第八天进入午宫，以七月安命;
 * 七月太阳在午宫，处暑后第九天进入巳宫，以八月安命;
 * 八月太阳在巳宫，秋分后第11天进入辰宫，以九月安命;
 * 九月太阳在辰宫，霜降后第13天进入卯宫，以十月安命;
 * 十月太阳在卯宫，小雪后第12天进入寅宫，以冬月安命;
 * 冬月太阳在寅宫，冬至后第八天进入丑宫，以腊月安命;
 * 腊月太阳在丑宫，大寒后第五天进入子宫，以正月安命。
 */
@Service("verifyMingGongDeal")
public class VerifyMingGongDeal implements MingGongDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        CnSolarTerm cnSolarTerm = paipanRunDTO.getCurrSolarTerm();
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String monthBranch = eightCharacterDTO.getMonthBranch();
        int index = cnSolarTerm.getTermIndex();
        if (index % 2 == 0) {
            eightCharacterDTO.setMingGongStartBranch(monthBranch);
            return;
        }
        String trueSunbirthDateTime = paipanRunDTO.getPaipanDTO().getTrueSunbirthDateTime();
        Date birthDate = DateUtil.parseDate(trueSunbirthDateTime,DateUtil.YYYY_MM_DD_HH_MM);
        Date termDate = cnSolarTerm.getTermDate();
        int difVerify = getDifDay(cnSolarTerm.getTermIndex());
        int realDif = getDifOfDate(termDate,birthDate);
        if (difVerify == 0 || realDif < difVerify){
            eightCharacterDTO.setMingGongStartBranch(monthBranch);
            return;
        }
        MonthBranchEnum monthBranchEnum = MonthBranchEnum.getByBranch(monthBranch);
        int monStartCode = monthBranchEnum.getCode() + 1;
        MonthBranchEnum monthStart = MonthBranchEnum.getByCode(monStartCode);
        eightCharacterDTO.setMingGongStartBranch(monthStart.getBranch());
    }

    private int getDifDay(int termIdx) {
        switch (termIdx) {
            case 1:
                return 5;
            case 3:
                return 7;
            case 5:
                return 9;
            case 6:
                return 10;
            case 9:
                return 9;
            case 11:
                return 8;
            case 13:
                return 9;
            case 15:
                return 11;
            case 17:
                return 13;
            case 19:
                return 12;
            case 21:
                return 8;
            case 23:
                return 5;
            default:
                return 0;
        }
    }

    private int getDifOfDate(Date date1,Date date2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        calendar1.set(Calendar.HOUR_OF_DAY,0);
        calendar1.set(Calendar.MINUTE,0);
        calendar1.set(Calendar.SECOND,0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar2.set(Calendar.HOUR_OF_DAY,0);
        calendar2.set(Calendar.MINUTE,0);
        calendar2.set(Calendar.SECOND,0);
        int offset = Math.round(((calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / 86400000.0f));
        return offset;

    }
}
