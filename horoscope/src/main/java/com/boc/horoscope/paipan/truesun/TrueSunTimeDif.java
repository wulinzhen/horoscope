package com.boc.horoscope.paipan.truesun;

import com.alibaba.druid.util.StringUtils;
import com.boc.horoscope.paipan.util.DateUtil;
import com.boc.horoscope.paipan.util.IntegerUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.boc.horoscope.paipan.util.DateUtil.MM_MONTH_DD_DAY;

public class TrueSunTimeDif {
    public static Map<String,String> map = new HashMap<>(540);
    static {
        map.put("01月01日","-3分9秒");
        map.put("01月02日","-3分38秒");
        map.put("01月03日","-4分6秒");
        map.put("01月04日","-4分33秒");
        map.put("01月05日","-5分1秒");
        map.put("01月06日","-5分27秒");
        map.put("01月07日","-5分54秒");
        map.put("01月08日","-6分20秒");
        map.put("01月09日","-6分45秒");
        map.put("01月10日","-7分10秒");
        map.put("01月11日","-7分35秒");
        map.put("01月12日","-7分59秒");
        map.put("01月13日","-8分22秒");
        map.put("01月14日","-8分45秒");
        map.put("01月15日","-9分7秒");
        map.put("01月16日","-9分28秒");
        map.put("01月17日","-9分49秒");
        map.put("01月18日","-10分9秒");
        map.put("01月19日","-10分28秒");
        map.put("01月20日","-10分47秒");
        map.put("01月21日","-11分5秒");
        map.put("01月22日","-11分22秒");
        map.put("01月23日","-11分38秒");
        map.put("01月24日","-11分54秒");
        map.put("01月25日","-12分8秒");
        map.put("01月26日","-12分22秒");
        map.put("01月27日","-12分35秒");
        map.put("01月28日","-12分59秒");
        map.put("01月29日","-13分10秒");
        map.put("01月30日","-13分19秒");
        map.put("01月31日","-13分37秒");
        map.put("02月01日","-13分44秒");
        map.put("02月02日","-13分50秒");
        map.put("02月03日","-13分56秒");
        map.put("02月04日","-14分1秒");
        map.put("02月05日","-14分5秒");
        map.put("02月06日","-14分9秒");
        map.put("02月07日","-14分11秒");
        map.put("02月08日","-14分13秒");
        map.put("02月09日","-14分14秒");
        map.put("02月10日","-14分15秒");
        map.put("02月11日","-14分14秒");
        map.put("02月12日","-14分13秒");
        map.put("02月13日","-14分11秒");
        map.put("02月14日","-14分8秒");
        map.put("02月15日","-14分5秒");
        map.put("02月16日","-14分1秒");
        map.put("02月17日","-13分56秒");
        map.put("02月18日","-13分51秒");
        map.put("02月19日","-13分44秒");
        map.put("02月20日","-13分38秒");
        map.put("02月21日","-13分30秒");
        map.put("02月22日","-13分22秒");
        map.put("02月23日","-13分13秒");
        map.put("02月24日","-11分4秒");
        map.put("02月25日","-12分54秒");
        map.put("02月26日","-12分43秒");
        map.put("02月27日","-12分32秒");
        map.put("02月28日","-12分21秒");
        map.put("02月29日","-12分8秒");
        map.put("03月01日","-11分56秒");
        map.put("03月02日","-11分43秒");
        map.put("03月03日","-11分29秒");
        map.put("03月04日","-11分15秒");
        map.put("03月05日","-11分1秒");
        map.put("03月06日","-10分47秒");
        map.put("03月07日","-10分32秒");
        map.put("03月08日","-10分16秒");
        map.put("03月09日","-10分1秒");
        map.put("03月10日","-9分45秒");
        map.put("03月11日","-9分28秒");
        map.put("03月12日","-9分12秒");
        map.put("03月13日","-8分55秒");
        map.put("03月14日","-8分38秒");
        map.put("03月15日","-8分21秒");
        map.put("03月16日","-8分4秒");
        map.put("03月17日","-7分46秒");
        map.put("03月18日","-7分29秒");
        map.put("03月19日","-7分11秒");
        map.put("03月20日","-6分53秒");
        map.put("03月21日","-6分35秒");
        map.put("03月22日","-6分17秒");
        map.put("03月23日","-5分58秒");
        map.put("03月24日","-5分40秒");
        map.put("03月25日","-5分22秒");
        map.put("03月26日","-5分4秒");
        map.put("03月27日","-4分45秒");
        map.put("03月28日","-4分27秒");
        map.put("03月29日","-4分9秒");
        map.put("03月30日","-3分51秒");
        map.put("03月31日","-3分33秒");
        map.put("04月01日","-3分16秒");
        map.put("04月02日","-2分58秒");
        map.put("04月03日","-2分41秒");
        map.put("04月04日","-2分24秒");
        map.put("04月05日","-2分7秒");
        map.put("04月06日","-1分50秒");
        map.put("04月07日","-1分33秒");
        map.put("04月08日","-1分17秒");
        map.put("04月09日","-1分1秒");
        map.put("04月10日","+0分46秒");
        map.put("04月11日","+0分30秒");
        map.put("04月12日","+0分16秒");
        map.put("04月13日","+0分1秒");
        map.put("04月14日","+0分13秒");
        map.put("04月15日","+0分27秒");
        map.put("04月16日","+0分41秒");
        map.put("04月17日","+0分54秒");
        map.put("04月18日","+1分6秒");
        map.put("04月19日","+1分19秒");
        map.put("04月20日","+1分31秒");
        map.put("04月21日","+1分42秒");
        map.put("04月22日","+1分53秒");
        map.put("04月23日","+2分4秒");
        map.put("04月24日","+2分14秒");
        map.put("04月25日","+2分23秒");
        map.put("04月26日","+2分33秒");
        map.put("04月27日","+2分41秒");
        map.put("04月28日","+2分49秒");
        map.put("04月29日","+2分57秒");
        map.put("04月30日","+3分4秒");
        map.put("05月01日","+1分10秒");
        map.put("05月02日","+3分16秒");
        map.put("05月03日","+3分21秒");
        map.put("05月04日","+3分26秒");
        map.put("05月05日","+3分30秒");
        map.put("05月06日","+3分37秒");
        map.put("05月07日","+3分36秒");
        map.put("05月08日","+3分39秒");
        map.put("05月09日","+3分40秒");
        map.put("05月10日","+3分42秒");
        map.put("05月11日","+3分42秒");
        map.put("05月12日","+3分42秒");
        map.put("05月13日","+3分42秒");
        map.put("05月14日","+3分41秒");
        map.put("05月15日","+3分39秒");
        map.put("05月16日","+3分37秒");
        map.put("05月17日","+3分34秒");
        map.put("05月18日","+3分31秒");
        map.put("05月19日","+3分27秒");
        map.put("05月20日","+3分23秒");
        map.put("05月21日","+3分18秒");
        map.put("05月22日","+3分13秒");
        map.put("05月23日","+3分7秒");
        map.put("05月24日","+3分1秒");
        map.put("05月25日","+2分54秒");
        map.put("05月26日","+2分47秒");
        map.put("05月27日","+2分39秒");
        map.put("05月28日","+2分31秒");
        map.put("05月29日","+2分22秒");
        map.put("05月30日","+2分13秒");
        map.put("05月31日","+2分4秒");
        map.put("06月01日","+1分54秒");
        map.put("06月02日","+1分44秒");
        map.put("06月03日","+1分34秒");
        map.put("06月04日","+1分23秒");
        map.put("06月05日","+1分12秒");
        map.put("06月06日","+1分0秒");
        map.put("06月07日","+0分48秒");
        map.put("06月08日","+0分36秒");
        map.put("06月09日","+0分24秒");
        map.put("06月10日","+0分12秒");
        map.put("06月11日","+0分1秒");
        map.put("06月12日","+0分14秒");
        map.put("06月13日","+0分39秒");
        map.put("06月14日","+0分52秒");
        map.put("06月15日","-1分5秒");
        map.put("06月16日","-1分18秒");
        map.put("06月17日","-1分31秒");
        map.put("06月18日","-1分45秒");
        map.put("06月19日","-1分57秒");
        map.put("06月20日","-2分10秒");
        map.put("06月21日","-2分23秒");
        map.put("06月22日","-2分36秒");
        map.put("06月23日","-2分48秒");
        map.put("06月24日","-3分1秒");
        map.put("06月25日","-3分13秒");
        map.put("06月26日","-3分25秒");
        map.put("06月27日","-3分37秒");
        map.put("06月28日","-3分49秒");
        map.put("06月29日","-4分0秒");
        map.put("06月30日","-4分11秒");
        map.put("07月01日","-4分22秒");
        map.put("07月02日","-4分33秒");
        map.put("07月03日","-4分43秒");
        map.put("07月04日","-4分53秒");
        map.put("07月05日","-5分2秒");
        map.put("07月06日","-5分11秒");
        map.put("07月07日","-5分20秒");
        map.put("07月08日","-5分28秒");
        map.put("07月09日","-5分36秒");
        map.put("07月10日","-5分43秒");
        map.put("07月11日","-5分50秒");
        map.put("07月12日","-5分56秒");
        map.put("07月13日","-6分2秒");
        map.put("07月14日","-6分8秒");
        map.put("07月15日","-6分12秒");
        map.put("07月16日","-6分16秒");
        map.put("07月17日","-6分20秒");
        map.put("07月18日","-6分23秒");
        map.put("07月19日","-6分25秒");
        map.put("07月20日","-6分27秒");
        map.put("07月21日","-6分29秒");
        map.put("07月22日","-6分29秒");
        map.put("07月23日","-6分29秒");
        map.put("07月24日","-6分29秒");
        map.put("07月25日","-6分28秒");
        map.put("07月26日","-6分26秒");
        map.put("07月27日","-6分24秒");
        map.put("07月28日","-6分21秒");
        map.put("07月29日","-6分17秒");
        map.put("07月30日","-6分13秒");
        map.put("07月31日","-6分8秒");
        map.put("08月01日","-6分3秒");
        map.put("08月02日","-5分57秒");
        map.put("08月03日","-5分51秒");
        map.put("08月04日","-5分44秒");
        map.put("08月05日","-5分36秒");
        map.put("08月06日","-5分28秒");
        map.put("08月07日","-5分19秒");
        map.put("08月08日","-5分10秒");
        map.put("08月09日","-5分0秒");
        map.put("08月10日","-4分50秒");
        map.put("08月11日","-4分39秒");
        map.put("08月12日","-4分27秒");
        map.put("08月13日","-4分15秒");
        map.put("08月14日","-4分2秒");
        map.put("08月15日","-3分49秒");
        map.put("08月16日","-3分36秒");
        map.put("08月17日","-3分21秒");
        map.put("08月18日","-3分7秒");
        map.put("08月19日","-2分51秒");
        map.put("08月20日","-2分36秒");
        map.put("08月21日","-2分20秒");
        map.put("08月22日","-2分3秒");
        map.put("08月23日","-1分47秒");
        map.put("08月24日","-1分29秒");
        map.put("08月25日","-1分12秒");
        map.put("08月26日","+0分54秒");
        map.put("08月27日","+0分35秒");
        map.put("08月28日","+0分17秒");
        map.put("08月29日","+0分2秒");
        map.put("08月30日","+0分21秒");
        map.put("08月31日","+0分41秒");
        map.put("09月01日","+1分0秒");
        map.put("09月02日","+1分20秒");
        map.put("09月03日","+1分40秒");
        map.put("09月04日","+2分1秒");
        map.put("09月05日","+2分21秒");
        map.put("09月06日","+2分42秒");
        map.put("09月07日","+3分3秒");
        map.put("09月08日","+3分3秒");
        map.put("09月09日","+3分24秒");
        map.put("09月10日","+3分45秒");
        map.put("09月11日","+4分6秒");
        map.put("09月12日","+4分27秒");
        map.put("09月13日","+4分48秒");
        map.put("09月14日","+5分10秒");
        map.put("09月15日","+5分31秒");
        map.put("09月16日","+5分53秒");
        map.put("09月17日","+6分14秒");
        map.put("09月18日","+6分35秒");
        map.put("09月19日","+6分57秒");
        map.put("09月20日","+7分18秒");
        map.put("09月21日","+7分39秒");
        map.put("09月22日","+8分0秒");
        map.put("09月23日","+8分21秒");
        map.put("09月24日","+8分42秒");
        map.put("09月25日","+9分2秒");
        map.put("09月26日","+9分22秒");
        map.put("09月27日","+9分42秒");
        map.put("09月28日","+10分2秒");
        map.put("09月29日","+10分21秒");
        map.put("09月30日","+10分40秒");
        map.put("10月01日","+10分59秒");
        map.put("10月02日","+11分18秒");
        map.put("10月03日","+11分36秒");
        map.put("10月04日","+11分36秒");
        map.put("10月05日","+11分53秒");
        map.put("10月06日","+12分11秒");
        map.put("10月07日","+12分28秒");
        map.put("10月08日","+12分44秒");
        map.put("10月09日","+12分60秒");
        map.put("10月10日","+13分16秒");
        map.put("10月11日","+13分16秒");
        map.put("10月12日","+13分31秒");
        map.put("10月13日","+13分45秒");
        map.put("10月14日","+13分59秒");
        map.put("10月15日","+14分13秒");
        map.put("10月16日","+14分26秒");
        map.put("10月17日","+14分38秒");
        map.put("10月18日","+14分50秒");
        map.put("10月19日","+15分1秒");
        map.put("10月20日","+15分12秒");
        map.put("10月21日","+15分21秒");
        map.put("10月22日","+15分31秒");
        map.put("10月23日","+15分40秒");
        map.put("10月24日","+15分48秒");
        map.put("10月25日","+15分55秒");
        map.put("10月26日","+16分1秒");
        map.put("10月27日","+16分7秒");
        map.put("10月28日","+16分12秒");
        map.put("10月29日","+16分16秒");
        map.put("10月30日","+16分20秒");
        map.put("10月31日","+16分22秒");
        map.put("11月01日","+16分24秒");
        map.put("11月02日","+16分25秒");
        map.put("11月03日","+16分25秒");
        map.put("11月04日","+16分24秒");
        map.put("11月05日","+16分23秒");
        map.put("11月06日","+16分21秒");
        map.put("11月07日","+16分17秒");
        map.put("11月08日","+16分13秒");
        map.put("11月09日","+16分9秒");
        map.put("11月10日","+16分3秒");
        map.put("11月11日","+15分56秒");
        map.put("11月12日","+15分49秒");
        map.put("11月13日","+15分41秒");
        map.put("11月14日","+15分32秒");
        map.put("11月15日","+15分22秒");
        map.put("11月16日","+15分11秒");
        map.put("11月17日","+14分60秒");
        map.put("11月18日","+14分47秒");
        map.put("11月19日","+14分34秒");
        map.put("11月20日","+14分20秒");
        map.put("11月21日","+14分6秒");
        map.put("11月22日","+13分50秒");
        map.put("11月23日","+13分34秒");
        map.put("11月24日","+13分17秒");
        map.put("11月25日","+12分59秒");
        map.put("11月26日","+12分40秒");
        map.put("11月27日","+12分21秒");
        map.put("11月28日","+12分1秒");
        map.put("11月29日","+11分40秒");
        map.put("11月30日","+11分18秒");
        map.put("12月01日","+10分56秒");
        map.put("12月02日","+10分33秒");
        map.put("12月03日","+10分9秒");
        map.put("12月04日","+9分45秒");
        map.put("12月05日","+9分21秒");
        map.put("12月06日","+8分55秒");
        map.put("12月07日","+8分29秒");
        map.put("12月08日","+8分3秒");
        map.put("12月09日","+7分36秒");
        map.put("12月10日","+7分9秒");
        map.put("12月11日","+6分42秒");
        map.put("12月12日","+6分14秒");
        map.put("12月13日","+5分46秒");
        map.put("12月14日","+5分17秒");
        map.put("12月15日","+4分48秒");
        map.put("12月16日","+4分19秒");
        map.put("12月17日","+3分50秒");
        map.put("12月18日","+3分21秒");
        map.put("12月19日","+2分51秒");
        map.put("12月20日","+2分22秒");
        map.put("12月21日","+1分52秒");
        map.put("12月22日","+1分22秒");
        map.put("12月23日","+0分52秒");
        map.put("12月24日","+0分23秒");
        map.put("12月25日","+0分7秒");
        map.put("12月26日","+0分37秒");
        map.put("12月27日","-1分6秒");
        map.put("12月28日","-1分36秒");
        map.put("12月29日","-2分5秒");
        map.put("12月30日","-2分34秒");
        map.put("12月31日","-3分3秒");
    }

    public static long getTrueTimeDif(Date date){
        String dateStr = DateUtil.formatDate(date,MM_MONTH_DD_DAY);
        String difStr = map.get(dateStr);
        if (StringUtils.isEmpty(difStr)){
            return 0;
        }
        return strToInt(difStr) * 1000;
    }

    private static int strToInt(String difStr){
        Character plus = difStr.charAt(0);
        String minutes = difStr.substring(1,difStr.indexOf("分"));
        String secs = difStr.substring(difStr.indexOf("分")+1,difStr.indexOf("秒"));
        int dif = IntegerUtil.parseInt(minutes) * 60 + IntegerUtil.parseInt(secs);
        if ('-' == plus){
            return 0-dif;
        }
        return dif;
    }
}
