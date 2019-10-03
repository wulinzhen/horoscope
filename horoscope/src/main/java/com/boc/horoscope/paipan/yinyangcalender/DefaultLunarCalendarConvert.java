package com.boc.horoscope.paipan.yinyangcalender;

import com.boc.horoscope.paipan.dto.PaipanDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class DefaultLunarCalendarConvert implements LunarCalendarConvert {

    @Autowired
    private LunarCalendarConvertUtil lunarCalendarConvertUtil;


    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        PaipanDTO paipanDTO = paipanRunDTO.getPaipanDTO();
        String time = paipanDTO.getTrueSunbirthDateTime();
        Date date = lunarCalendarConvertUtil.lunarConvert(time);
        paipanRunDTO.setLunarDate(date);
    }
}
