package com.boc.horoscope.paipan.shierchangsheng;

import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import com.boc.horoscope.paipan.monthcolumn.MonthHeavenlyEnum;

import java.util.HashMap;
import java.util.Map;

public class ShiErChangShengTable {
    public static Map<String,String> CHANG_SHENG_MAP = new HashMap<>();
    static {
        CHANG_SHENG_MAP.put("甲","亥");
        CHANG_SHENG_MAP.put("乙","午");
        CHANG_SHENG_MAP.put("丙","寅");
        CHANG_SHENG_MAP.put("丁","酉");
        CHANG_SHENG_MAP.put("戊","寅");
        CHANG_SHENG_MAP.put("己","酉");
        CHANG_SHENG_MAP.put("庚","巳");
        CHANG_SHENG_MAP.put("辛","子");
        CHANG_SHENG_MAP.put("壬","申");
        CHANG_SHENG_MAP.put("癸","卯");
    }

    public static String getChangsheng(String srcHeav,String targetBran){
        MonthHeavenlyEnum monthHeavenlyEnum = MonthHeavenlyEnum.getByHeavenly(srcHeav);
        boolean areSun = monthHeavenlyEnum.getCode()%2 == 1;
        String changShengBran = CHANG_SHENG_MAP.get(srcHeav);
        MonthBranchEnum changShengBranEnum = MonthBranchEnum.getByBranch(changShengBran);
        MonthBranchEnum targetBranEnum = MonthBranchEnum.getByBranch(targetBran);
        int diff = targetBranEnum.getCode() - changShengBranEnum.getCode();
        if (diff == 0){
            return ShiErChangShengEnum.长生.getShiErChangSheng();
        }
        if (areSun){
            diff = 13 + diff;
        }else {
            diff = 13 - diff;
        }
        return ShiErChangShengEnum.getByCode(diff).getShiErChangSheng();
    }

    public static String getSunChangsheng(String srcHeav,String targetBran){
        MonthHeavenlyEnum monthHeavenlyEnum = MonthHeavenlyEnum.getByHeavenly(srcHeav);
        boolean areSun = monthHeavenlyEnum.getCode()%2 == 1;
        if (!areSun){
            srcHeav = MonthHeavenlyEnum.getByCode(monthHeavenlyEnum.getCode()-1).getHeavenly();
        }
        String changShengBran = CHANG_SHENG_MAP.get(srcHeav);
        MonthBranchEnum changShengBranEnum = MonthBranchEnum.getByBranch(changShengBran);
        MonthBranchEnum targetBranEnum = MonthBranchEnum.getByBranch(targetBran);
        int diff = targetBranEnum.getCode() - changShengBranEnum.getCode();
        if (diff == 0){
            return ShiErChangShengEnum.长生.getShiErChangSheng();
        }
        if (areSun){
            diff = 12 + diff;
        }else {
            diff = 12 - diff;
        }
        return ShiErChangShengEnum.getByCode(diff).getShiErChangSheng();
    }



}
