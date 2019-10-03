package com.boc.horoscope.paipan.dayun.dayun;

import com.boc.horoscope.paipan.dayun.DaYunDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("makeDayunGodDeal")
public class MakeDayunGodDeal implements DayunDeal {

    @Autowired
    private DayunDealUtil dayunDealUtil;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        List<DaYunDTO> daYunDTOS = paipanRunDTO.getDaYunDTOS();
        if (CollectionUtils.isEmpty(daYunDTOS)){
            return;
        }
        dayunDealUtil.computeYearColumn(paipanRunDTO);
    }
}
