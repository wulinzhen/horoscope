package com.boc.horoscope.paipan.shensa;

import com.boc.horoscope.horos.mapper.HsGodEvilMapper;
import com.boc.horoscope.horos.po.HsGodEvil;
import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DayHeavShenShaDeal implements ShenShaDeal {

    @Autowired
    private ShenShaDealUtil shenShaDealUtil;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        //年支为主，查询月支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,1,2);
        //年支为主，查询日支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,1,3);
        //年支为主，查询时支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,1,4);

        //日干为主，查询年支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,2,1);
        //日干为主，查询月支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,2,2);
        //日干为主，查询日支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,2,3);
        //日干为主，查询时支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,2,4);

        //月支为主，查询年支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,3,1);
        //月支为主，查询日支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,3,3);
        //月支为主，查询时支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,3,4);

        //日支为主，查询年支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,4,1);
        //日支为主，查询月支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,4,2);
        //日支为主，查询时支神煞
        shenShaDealUtil.setShenSha(eightCharacterDTO,4,4);
    }
}
