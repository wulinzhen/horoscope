package com.boc.horoscope.paipan.dayun.jiaoyun;

import com.boc.horoscope.paipan.util.DateUtil;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

import static com.boc.horoscope.paipan.util.DateUtil.ONE_DAY_M_SEC;
import static com.boc.horoscope.paipan.util.DateUtil.ONE_HOUR_M_SEC;

@Component
public class QiyunDealUtil {
    public String[] getQiyunDate(String birthDate,String solarDate){
        Date birthDate1 = DateUtil.parseDate(birthDate,DateUtil.YYYY_MM_DD_HH_MM);
        Date solarDate1 = DateUtil.parseDate(solarDate,DateUtil.YYYY_MM_DD_HH_MM_SS);
        //相差毫秒数
        long diffMs = Math.abs(birthDate1.getTime() - solarDate1.getTime());
        //相差天数
        long day = diffMs/ONE_DAY_M_SEC;
        //减去天数相差不足1天的毫秒数
        long dayYu = diffMs%ONE_DAY_M_SEC;

        /**1个小时为5天**/
        long hour = dayYu*5/ONE_HOUR_M_SEC;

        /**3天为1年**/
        int year = (int) (day/3);
        /**1天为4个月**/
        int yearYu = (int) (day%3);
        int month = yearYu * 4;
        int dayHour = (int) (hour);
        //天数超过30,月加1
        month= month + dayHour/30;
        //天数对30求模
        dayHour = dayHour%30;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthDate1);
        calendar.add(Calendar.YEAR,year);
        calendar.add(Calendar.MONTH,month);
        calendar.add(Calendar.DAY_OF_MONTH,dayHour);
        Date qiyunDate = calendar.getTime();
        String [] strings = new String[2];
        strings[0] = DateUtil.formatDate(qiyunDate,DateUtil.YYYY_MM_DD_HH_MM);
        String s = "%s年%s月%s天";
        s = String.format(s,year,month,dayHour);
        strings[1] = s;
        return strings;
    }
}
