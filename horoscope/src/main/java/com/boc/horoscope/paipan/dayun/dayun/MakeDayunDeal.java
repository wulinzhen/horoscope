package com.boc.horoscope.paipan.dayun.dayun;

import com.boc.horoscope.paipan.dayun.DaYunDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.util.DateUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component("makeDayunDeal")
public class MakeDayunDeal implements DayunDeal {

    @Resource(name = "makeDayunGodDeal")
    private DayunDeal makeDayunGodDeal;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        String qiyunDate = paipanRunDTO.getJiaoyunDate();
        Date date = DateUtil.parseDate(qiyunDate,DateUtil.YYYY_MM_DD_HH_MM);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        List<DaYunDTO> daYunDTOS = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            DaYunDTO daYunDTO = new DaYunDTO();
            daYunDTO.setDayunDate(DateUtil.formatDate(calendar.getTime(),DateUtil.YYYY_MM_DD_HH_MM));
            daYunDTOS.add(daYunDTO);
            calendar.add(Calendar.YEAR,10);
        }
        paipanRunDTO.setDaYunDTOS(daYunDTOS);
        makeDayunGodDeal.deal(paipanRunDTO);
    }
}
