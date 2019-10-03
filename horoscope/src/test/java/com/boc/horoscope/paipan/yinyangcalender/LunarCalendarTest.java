package com.boc.horoscope.paipan.yinyangcalender;

import com.boc.horoscope.BaseJunit4Test;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.Assert.*;

public class LunarCalendarTest {

    private static Map<String,String> TEST_MAP = new LinkedHashMap<>();

    static {
        TEST_MAP.put("1991-05-25","1991-04-12");
        TEST_MAP.put("1991-09-20","1991-08-13");
        TEST_MAP.put("1991-06-08","1991-04-26");
        TEST_MAP.put("1990-07-13","1990-05-21");


    }

    @Test
    public void solarTolunar() throws Exception {
        TEST_MAP.keySet().stream().forEach(s -> {
            String lunar = TEST_MAP.get(s);
            String testLunar = LunarCalendar2.solarToLunar2(s);
            System.out.println(testLunar);
            Assert.assertTrue(lunar.equals(testLunar));
            String testSonar = LunarCalendar2.lunarToSolar2(lunar,true);
            System.out.println(testSonar);
            Assert.assertTrue(s.equals(testSonar));
        });
    }

}