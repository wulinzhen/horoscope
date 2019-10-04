package com.boc.horoscope.paipan.template;

import com.boc.horoscope.paipan.canggan.CangGanDeal;
import com.boc.horoscope.paipan.daycolumn.DefaultDayColumnDeal;
import com.boc.horoscope.paipan.dayun.dayun.DayunDeal;
import com.boc.horoscope.paipan.dayun.jiaoyun.MakeQiyunDeal;
import com.boc.horoscope.paipan.dayun.liunian.LiuNianDeal;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.hourcolumn.DefaultHourColumnDeal;
import com.boc.horoscope.paipan.kongwang.KongWangDeal;
import com.boc.horoscope.paipan.minggong.MingGongDeal;
import com.boc.horoscope.paipan.monthcolumn.DefaultMonthColumnDeal;
import com.boc.horoscope.paipan.nayin.NaYinColumnDeal;
import com.boc.horoscope.paipan.shensa.ShenShaDeal;
import com.boc.horoscope.paipan.shierchangsheng.ShiErChangShengDeal;
import com.boc.horoscope.paipan.solarterms.DefaultBirthSolarTermsDeal;
import com.boc.horoscope.paipan.taiyuan.TaiYuanDeal;
import com.boc.horoscope.paipan.tengod.TenGodDeal;
import com.boc.horoscope.paipan.truesun.DefaultTrueSunDeal;
import com.boc.horoscope.paipan.yearcolumn.DefaultYearColumnDeal;
import com.boc.horoscope.paipan.yinyangcalender.DefaultLunarCalendarConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("defaultPaiPanTemplate")
public class DefaultPaiPanTemplate extends PaiPanTemplate{

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

    @Autowired
    private LiuNianDeal liuNianDeal;


    @Override
    public void paiPanProcess(PaipanRunDTO paipanRunDTO) {
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
        liuNianDeal.deal(paipanRunDTO);
    }
}
