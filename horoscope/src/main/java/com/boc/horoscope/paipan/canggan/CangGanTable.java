package com.boc.horoscope.paipan.canggan;

import java.util.*;

public class CangGanTable {
    public static Map<String, List<String>> CANG_GAN_MAP = new LinkedHashMap<>(20);
    static {
        CANG_GAN_MAP.put("子",new ArrayList<>(Arrays.asList("癸")));
        CANG_GAN_MAP.put("丑",new ArrayList<>(Arrays.asList("己","癸","辛")));
        CANG_GAN_MAP.put("寅",new ArrayList<>(Arrays.asList("甲","丙","戊")));
        CANG_GAN_MAP.put("卯",new ArrayList<>(Arrays.asList("乙")));
        CANG_GAN_MAP.put("辰",new ArrayList<>(Arrays.asList("戊","乙","癸")));
        CANG_GAN_MAP.put("巳",new ArrayList<>(Arrays.asList("丙","庚","戊")));
        CANG_GAN_MAP.put("午",new ArrayList<>(Arrays.asList("丁","己")));
        CANG_GAN_MAP.put("未",new ArrayList<>(Arrays.asList("己","丁","乙")));
        CANG_GAN_MAP.put("申",new ArrayList<>(Arrays.asList("庚","壬","戊")));
        CANG_GAN_MAP.put("酉",new ArrayList<>(Arrays.asList("辛")));
        CANG_GAN_MAP.put("戌",new ArrayList<>(Arrays.asList("戊","辛","丁")));
        CANG_GAN_MAP.put("亥",new ArrayList<>(Arrays.asList("壬","甲")));
    }

    public static List<String> getCangGan(String branch){
        return CANG_GAN_MAP.get(branch);
    }
}
