package com.boc.horoscope.hororecd.service.impl;

import com.boc.horoscope.hororecd.service.HsPersonHoroscopeRecdService;
import com.boc.horoscope.horos.mapper.HsPersonHoroscopeRecdMapper;
import com.boc.horoscope.horos.po.HsPersonHoroscopeRecd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HsPersonHoroscopeRecdServiceImpl implements HsPersonHoroscopeRecdService {

    @Autowired
    private HsPersonHoroscopeRecdMapper hsPersonHoroscopeRecdMapper;

    @Override
    public void inserHoroRecd(HsPersonHoroscopeRecd hsPersonHoroscopeRecd) {
        hsPersonHoroscopeRecdMapper.insertSelective(hsPersonHoroscopeRecd);
    }
}
