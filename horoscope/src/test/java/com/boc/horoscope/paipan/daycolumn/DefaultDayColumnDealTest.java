package com.boc.horoscope.paipan.daycolumn;

import com.alibaba.fastjson.JSON;
import com.boc.horoscope.BaseJunit4Test;
import com.boc.horoscope.paipan.canggan.CangGanDeal;
import com.boc.horoscope.paipan.dayun.dayun.DayunDeal;
import com.boc.horoscope.paipan.dayun.dayun.MakeDayunDeal;
import com.boc.horoscope.paipan.dto.BirthPlaceDTO;
import com.boc.horoscope.paipan.dto.PaipanDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.hourcolumn.DefaultHourColumnDeal;
import com.boc.horoscope.paipan.kongwang.KongWangDeal;
import com.boc.horoscope.paipan.minggong.MingGongDeal;
import com.boc.horoscope.paipan.monthcolumn.DefaultMonthColumnDeal;
import com.boc.horoscope.paipan.dayun.jiaoyun.MakeQiyunDeal;
import com.boc.horoscope.paipan.nayin.NaYinColumnDeal;
import com.boc.horoscope.paipan.shensa.DayHeavShenShaDeal;
import com.boc.horoscope.paipan.shensa.ShenShaDeal;
import com.boc.horoscope.paipan.shierchangsheng.ShiErChangShengDeal;
import com.boc.horoscope.paipan.solarterms.DefaultBirthSolarTermsDeal;
import com.boc.horoscope.paipan.taiyuan.TaiYuanDeal;
import com.boc.horoscope.paipan.tengod.TenGodDeal;
import com.boc.horoscope.paipan.truesun.DefaultTrueSunDeal;
import com.boc.horoscope.paipan.yearcolumn.DefaultYearColumnDeal;
import com.boc.horoscope.paipan.yinyangcalender.DefaultLunarCalendarConvert;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class DefaultDayColumnDealTest extends BaseJunit4Test{

    private static Logger logger = LoggerFactory.getLogger(DefaultDayColumnDealTest.class);

    @Autowired
    private DefaultLunarCalendarConvert defaultLunarCalendarConvert;

    @Autowired
    private DefaultTrueSunDeal defaultTrueSunDeal;

    @Autowired
    private DefaultBirthSolarTermsDeal defaultBirthSolarTermsDeal;

    @Autowired
    private DefaultYearColumnDeal defaultYearColumnDeal;

    @Autowired
    private DefaultMonthColumnDeal defaultMonthColumnDeal;

    @Autowired
    private DefaultDayColumnDeal defaultDayColumnDeal;

    @Autowired
    private DefaultHourColumnDeal defaultHourColumnDeal;

    @Resource(name = "defaultCangGanDeal")
    private CangGanDeal defaultCangGanDeal;

    @Resource(name = "defaultTenGodDeal")
    private TenGodDeal defaultTenGodDeal;

    @Autowired
    private MakeQiyunDeal makeQiyunDeal;

    @Resource(name = "makeDayunDeal")
    private DayunDeal makeDayunDeal;

    @Autowired
    private NaYinColumnDeal naYinColumnDeal;

    @Autowired
    private ShiErChangShengDeal shiErChangShengDeal;

    @Autowired
    private ShenShaDeal dayHeavShenShaDeal;

    @Autowired
    private KongWangDeal kongWangDeal;

    @Autowired
    private TaiYuanDeal taiYuanDeal;

    @Resource(name = "computeMingGongDeal")
    private MingGongDeal computeMingGongDeal;

    @Test
    public void deal() throws Exception {
        PaipanRunDTO paipanRunDTO = new PaipanRunDTO();
        PaipanDTO paipanDTO = new PaipanDTO();
        paipanDTO.setBirthDateTime("2019-02-21 11:13");
        paipanDTO.setSunOrlun(1);
        paipanDTO.setAreLeapMonth(false);
        BirthPlaceDTO birthPlaceDTO = new BirthPlaceDTO();
        birthPlaceDTO.setArea("511623");
        paipanDTO.setBirthPlace(birthPlaceDTO);
        paipanDTO.setSex(2);
        paipanRunDTO.setPaipanDTO(paipanDTO);

        defaultTrueSunDeal.deal(paipanRunDTO);
        defaultLunarCalendarConvert.deal(paipanRunDTO);

        defaultBirthSolarTermsDeal.deal(paipanRunDTO);
        defaultYearColumnDeal.deal(paipanRunDTO);
        defaultMonthColumnDeal.deal(paipanRunDTO);
        defaultDayColumnDeal.deal(paipanRunDTO);
        defaultHourColumnDeal.deal(paipanRunDTO);
        defaultCangGanDeal.deal(paipanRunDTO);
        defaultTenGodDeal.deal(paipanRunDTO);
        makeQiyunDeal.deal(paipanRunDTO);
        makeDayunDeal.deal(paipanRunDTO);
        naYinColumnDeal.deal(paipanRunDTO);
        shiErChangShengDeal.deal(paipanRunDTO);
        dayHeavShenShaDeal.deal(paipanRunDTO);
        taiYuanDeal.deal(paipanRunDTO);
        kongWangDeal.deal(paipanRunDTO);
        computeMingGongDeal.deal(paipanRunDTO);
        logger.info("PaipanRunDTO:{}", JSON.toJSONString( paipanRunDTO));

    }

}