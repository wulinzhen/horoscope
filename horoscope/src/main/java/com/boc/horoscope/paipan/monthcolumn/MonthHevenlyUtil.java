package com.boc.horoscope.paipan.monthcolumn;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 根据年干和月支获取月干
 */
public class MonthHevenlyUtil {
    public static Map<String,String> yearStartMonthMap = new LinkedHashMap<>(20);

    static {
        yearStartMonthMap.put("甲","丙");
        yearStartMonthMap.put("己","丙");
        yearStartMonthMap.put("乙","戊");
        yearStartMonthMap.put("庚","戊");
        yearStartMonthMap.put("丙","庚");
        yearStartMonthMap.put("辛","庚");
        yearStartMonthMap.put("丁","壬");
        yearStartMonthMap.put("壬","壬");
        yearStartMonthMap.put("戊","甲");
        yearStartMonthMap.put("癸","甲");
    }


    public static String getMonthHevenly(String yearHevenly, String monthBranch){
        String startMonthHeavenly = yearStartMonthMap.get(yearHevenly);
        MonthBranchEnum monthBranchEnum = MonthBranchEnum.getByBranch(monthBranch);
        MonthHeavenlyEnum monthHeavenlyEnum = MonthHeavenlyEnum.getByHeavenly(startMonthHeavenly);
        int offset = monthBranchEnum.getCode() - 1;
        int afterOffset = (monthHeavenlyEnum.getCode()  + offset)%10;
        MonthHeavenlyEnum tarMonthHeavenlyEnum = MonthHeavenlyEnum.getByCode(afterOffset);
        return tarMonthHeavenlyEnum.getHeavenly();

    }
}
