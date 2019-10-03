package com.boc.horoscope.paipan.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String MM_MONTH_DD_DAY = "MM月dd日";

    public static final long ONE_DAY_SEC = 24 * 60  * 60 ;

    public static final long ONE_HOUR_SEC =  60  * 60 ;

    public static final long ONE_DAY_M_SEC = ONE_DAY_SEC * 1000;

    public static final long ONE_HOUR_M_SEC = ONE_HOUR_SEC * 1000;


    private static SerializeConfig mapping = new SerializeConfig();
    private static String dateFormat;
    static {
        dateFormat = "yyyy-MM-dd HH:mm:ss";
        mapping.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
    }

    public static String formatDate(Date date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    public static Date parseDate(String date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
