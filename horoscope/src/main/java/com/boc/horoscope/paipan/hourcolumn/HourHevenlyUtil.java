package com.boc.horoscope.paipan.hourcolumn;

import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import com.boc.horoscope.paipan.monthcolumn.MonthHeavenlyEnum;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.boc.horoscope.paipan.monthcolumn.MonthHevenlyUtil.yearStartMonthMap;

/**
 * 根据年干和月支获取月干
 */
public class HourHevenlyUtil {

    public static String getHourHevenly(String dayHevenly, String hourBranch){
        String startMonthHeavenly = yearStartMonthMap.get(dayHevenly);
        HourBranchEnum hourBranchEnum = HourBranchEnum.getByBranch(hourBranch);
        MonthHeavenlyEnum monthHeavenlyEnum = MonthHeavenlyEnum.getByHeavenly(startMonthHeavenly);
        int offset = hourBranchEnum.getCode() - 1;
        int afterOffset = (monthHeavenlyEnum.getCode() + 8 + offset)%10;
        MonthHeavenlyEnum tarMonthHeavenlyEnum = MonthHeavenlyEnum.getByCode(afterOffset);
        return tarMonthHeavenlyEnum.getHeavenly();

    }
}
