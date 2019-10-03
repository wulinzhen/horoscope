package com.boc.horoscope.paipan.truesun;

import com.boc.horoscope.paipan.util.DateUtil;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

import static com.boc.horoscope.paipan.util.DateUtil.YYYY_MM_DD_HH_MM;

@Component
public class TrueSunDealUtil {

    private static final double ZONE_8_LNG = 120;

    private static final int ONE_LNG_MS = 4 * 60 * 1000;

    public Date trueSun(Date date, double lng) {
        boolean isEqual = Double.doubleToLongBits(ZONE_8_LNG) == Double.doubleToLongBits(lng);
        if (isEqual) {
            return date;
        }
        double ms = (lng - ZONE_8_LNG) * ONE_LNG_MS;
        long msLong = Math.round(ms);
        long tarTime = date.getTime() + msLong + TrueSunTimeDif.getTrueTimeDif(date);
        Date date1 =  new Date(tarTime);
        return date1;
    }

    public static void main(String[] args) {
        TrueSunDealUtil trueSunDealUtil =  new TrueSunDealUtil();
//        System.out.println(DateUtil.formatDate(trueSunDealUtil.trueSun(DateUtil.parseDate("1991-04-12 08:00",
//                YYYY_MM_DD_HH_MM),104.065735),YYYY_MM_DD_HH_MM));
        System.out.println(DateUtil.formatDate(trueSunDealUtil.trueSun(DateUtil.parseDate("2019-2-12 11:13",
                YYYY_MM_DD_HH_MM),106.934967),YYYY_MM_DD_HH_MM));

    }
}
