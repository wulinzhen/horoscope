package com.boc.horoscope.paipan.truesun;

import com.boc.horoscope.horos.mapper.CnRegionInfoMapper;
import com.boc.horoscope.horos.po.CnRegionInfo;
import com.boc.horoscope.paipan.dto.PaipanDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.util.DateUtil;
import com.boc.horoscope.paipan.util.IntegerUtil;
import com.boc.horoscope.paipan.yinyangcalender.LunarCalendarConvertUtil;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.boc.horoscope.paipan.util.DateUtil.YYYY_MM_DD_HH_MM;

@Component
public class DefaultTrueSunDeal implements TrueSunDeal {

    @Autowired
    private CnRegionInfoMapper cnRegionInfoMapper;

    @Autowired
    private LunarCalendarConvertUtil lunarCalendarConvertUtil;

    @Autowired
    private TrueSunDealUtil trueSunDealUtil;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        CnRegionInfo cnRegionInfo = cnRegionInfoMapper.selectByCriCode(paipanRunDTO.getPaipanDTO().
                getBirthPlace().getArea());
        double lng = IntegerUtil.parseDouble(cnRegionInfo.getCriLng());
        PaipanDTO paipanDTO = paipanRunDTO.getPaipanDTO();
        String sunDate = paipanDTO.getBirthDateTime();
        if (paipanDTO.getSunOrlun() == 2){
            sunDate = DateUtil.formatDate(lunarCalendarConvertUtil.
                    sunarConvert(sunDate,paipanDTO.isAreLeapMonth()),YYYY_MM_DD_HH_MM);
        }
        Date date = DateUtil.parseDate(sunDate,YYYY_MM_DD_HH_MM);
        date = trueSunDealUtil.trueSun(date,lng);
        paipanDTO.setTrueSunbirthDateTime( DateUtil.formatDate(date,YYYY_MM_DD_HH_MM));
    }
}
