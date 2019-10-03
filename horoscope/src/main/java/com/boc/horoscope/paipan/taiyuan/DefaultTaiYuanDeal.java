package com.boc.horoscope.paipan.taiyuan;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthBranchEnum;
import com.boc.horoscope.paipan.monthcolumn.MonthHeavenlyEnum;
import org.springframework.stereotype.Service;

/**
 * 胎指人受精怀胎的月份，元是开始了。其起法是：人生月后紧接着这个月的天干与生月后第三个月的地支相配，就为胎元。
 * 即出生月的天干进一位、地支进三位，此法是求怀胎十月即受孕月的干支。口诀：胎元起法记心中，生月干支要记清；
 * 月干后位胎元干，月支后三胎元支。

 例如：戊寅年辛酉月生人，辛后一位为壬，酉后三位为子，则胎元为壬子，其余类推。戊寅纳音为土，
 壬子纳音为木，木克土不利命。胎元生命为吉，克命不利。胎月见贵, 必受福荫； 刑冲破害，决主艰辛。
 鬼谷子说：“胎中如有禄，生在富贵家；或值空亡中，贫穷起怨嗟。”胎元干支与生时干支纳音相生主长寿，
 如果和时干支刑冲克害主寿短；胎元临帝旺，必然高寿。
 */
@Service
public class DefaultTaiYuanDeal implements TaiYuanDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String monthHeavenly= eightCharacterDTO.getMonthHeavenly();
        String monthBranch = eightCharacterDTO.getMonthBranch();
        MonthBranchEnum branch = MonthBranchEnum.getByBranch(monthBranch);
        MonthHeavenlyEnum heavenly = MonthHeavenlyEnum.getByHeavenly(monthHeavenly);
        int taiyuanB = branch.getCode() + 3;
        int taiyuanH = heavenly.getCode() + 1;
        MonthBranchEnum branch1 = MonthBranchEnum.getByCode(taiyuanB);
        MonthHeavenlyEnum heavenly1 = MonthHeavenlyEnum.getByCode(taiyuanH);
        eightCharacterDTO.setTaiYuanBranch(branch1.getBranch());
        eightCharacterDTO.setTaiYuanHeavenly(heavenly1.getHeavenly());
    }
}
