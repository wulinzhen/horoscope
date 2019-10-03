package com.boc.horoscope.paipan.minggong;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.monthcolumn.MonthHevenlyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 要知命宫的所属天干，可用“五虎遁”月歌来推算，如丙年生人，命宫在辰，则从“丙辛之岁从庚起”
 的歌诀中可得知寅上加庚，卯上加辛，辰上加壬，故知其命宫的干支为“壬辰”。又如壬年生人，命宫在午，
 则以“丁壬壬寅顺行流”的歌诀中，可得知寅上加壬，卯上加癸，辰上加甲，巳上加乙，午上加丙，
 可知其命宫的干支为“丙午”。以上就是命宫是什么意思？命宫详解之八字命宫表的排法。
 */
@Service("computeMingGongDeal")
public class ComputeMingGongDeal implements MingGongDeal {

    @Resource(name = "verifyMingGongDeal")
    private MingGongDeal verifyMingGongDeal;

    @Resource(name = "computeBranchMingGongDeal")
    private MingGongDeal computeBranchMingGongDeal;

    @Resource(name = "computeHeavMingGongDeal")
    private MingGongDeal computeHeavMingGongDeal;


    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        verifyMingGongDeal.deal(paipanRunDTO);
        computeBranchMingGongDeal.deal(paipanRunDTO);
        computeHeavMingGongDeal.deal(paipanRunDTO);
    }
}
