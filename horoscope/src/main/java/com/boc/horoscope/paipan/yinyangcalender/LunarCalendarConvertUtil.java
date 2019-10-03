package com.boc.horoscope.paipan.yinyangcalender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LunarCalendarConvertUtil {

    public static final String DATE_FORMAT="yyyy-MM-dd HH:mm";

    public static final String DATE_SPLIT="-";

    private static Logger logger = LoggerFactory.getLogger(LunarCalendarConvertUtil.class);

    private static final  SimpleDateFormat DATETIME_FORMATTER = new SimpleDateFormat(DATE_FORMAT);;

    public Date lunarConvert(String sunarDate){

        String day = sunarDate.split(" ")[0];
        String lunarDay = LunarCalendar2.solarToLunar2(day);
        String time = sunarDate.split(" ")[1];
        StringBuilder builder = new StringBuilder();
        builder.append(lunarDay).append(" ").append(time);
        try {
            return DATETIME_FORMATTER.parse(builder.toString()) ;
        } catch (ParseException e) {
            logger.error(e.getMessage(),e);
            return null;
        }
    }

    public Date sunarConvert(String lunarDate,boolean areLeafMonth){
        String day = lunarDate.split(" ")[0];
        String sunarDay = LunarCalendar2.lunarToSolar2(day, areLeafMonth);
        String time = lunarDate.split(" ")[1];
        StringBuilder builder = new StringBuilder();
        builder.append(sunarDay).append(" ").append(time);
        try {
            return DATETIME_FORMATTER.parse(builder.toString()) ;
        } catch (ParseException e) {
            logger.error(e.getMessage(),e);
            return null;
        }
    }



    public static void main(String[] args) {
        LunarCalendarConvertUtil lunarCalendarConvertUtil = new LunarCalendarConvertUtil();
        Date localDateTime = lunarCalendarConvertUtil.lunarConvert("1991-05-25 23:00");
        System.out.println((DATETIME_FORMATTER.format(localDateTime)));

        Date localDateTime2 = lunarCalendarConvertUtil.lunarConvert("1991-09-20 23:00");
        System.out.println((DATETIME_FORMATTER.format(localDateTime2)));

        Date localDateTime3 = lunarCalendarConvertUtil.lunarConvert("1991-8-13 23:00");
        System.out.println((DATETIME_FORMATTER.format(localDateTime3)));

        Date localDateTime4 = lunarCalendarConvertUtil.sunarConvert("1991-04-12 23:00",true);
        System.out.println((DATETIME_FORMATTER.format(localDateTime4)));

    }

}
