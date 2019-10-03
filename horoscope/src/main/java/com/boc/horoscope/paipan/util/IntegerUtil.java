package com.boc.horoscope.paipan.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IntegerUtil {
    public static int parseInt( Object str){
        try {
            return Integer.parseInt(String.valueOf(str));
        }catch (Exception e){
            return 0;
        }
    }
    public static double parseDouble( Object str){
        try {
            return Double.parseDouble(String.valueOf(str));
        }catch (Exception e){
            return 0;
        }
    }
}
