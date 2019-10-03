package com.boc.horoscope.paipan.monthcolumn;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 根据节气指数获取月支
 */
public class SolarTermMonthBranch {
    /**
     * key为24节气的指数
     *  0	立春
     1	雨水
     2	惊蛰
     3	春分
     4	清明
     5	谷雨
     6	立夏
     7	小满
     8	芒种
     9	夏至
     10	小暑
     11	大暑
     12	立秋
     13	处暑
     14	白露
     15	秋分
     16	寒露
     17	霜降
     18	立冬
     19	小雪
     20	大雪
     21	冬至
     22	小寒
     23	大寒
     */
    private static Map<Integer,MonthBranchEnum> monthBranchEnumMap = new LinkedHashMap<>(40);
    static {
        monthBranchEnumMap.put(0,MonthBranchEnum.YIN);
        monthBranchEnumMap.put(1,MonthBranchEnum.YIN);
        monthBranchEnumMap.put(2,MonthBranchEnum.MAO);
        monthBranchEnumMap.put(3,MonthBranchEnum.MAO);
        monthBranchEnumMap.put(4,MonthBranchEnum.CHEN);
        monthBranchEnumMap.put(5,MonthBranchEnum.CHEN);
        monthBranchEnumMap.put(6,MonthBranchEnum.SI);
        monthBranchEnumMap.put(7,MonthBranchEnum.SI);
        monthBranchEnumMap.put(8,MonthBranchEnum.WU);
        monthBranchEnumMap.put(9,MonthBranchEnum.WU);
        monthBranchEnumMap.put(10,MonthBranchEnum.WEI);
        monthBranchEnumMap.put(11,MonthBranchEnum.WEI);
        monthBranchEnumMap.put(12,MonthBranchEnum.SHEN);
        monthBranchEnumMap.put(13,MonthBranchEnum.SHEN);
        monthBranchEnumMap.put(14,MonthBranchEnum.YOU);
        monthBranchEnumMap.put(15,MonthBranchEnum.YOU);
        monthBranchEnumMap.put(16,MonthBranchEnum.XU);
        monthBranchEnumMap.put(17,MonthBranchEnum.XU);
        monthBranchEnumMap.put(18,MonthBranchEnum.HAI);
        monthBranchEnumMap.put(19,MonthBranchEnum.HAI);
        monthBranchEnumMap.put(20,MonthBranchEnum.ZI);
        monthBranchEnumMap.put(21,MonthBranchEnum.ZI);
        monthBranchEnumMap.put(22,MonthBranchEnum.CHOU);
        monthBranchEnumMap.put(23,MonthBranchEnum.CHOU);
    }

    public static MonthBranchEnum getBySolarTermIdx(int solerTermIdx){
        return monthBranchEnumMap.get(solerTermIdx);
    }
}
