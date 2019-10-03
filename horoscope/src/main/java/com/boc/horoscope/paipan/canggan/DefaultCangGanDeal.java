package com.boc.horoscope.paipan.canggan;

import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("defaultCangGanDeal")
public class DefaultCangGanDeal implements CangGanDeal {

    @Resource(name = "makeCangGanDeal")
    private CangGanDeal cangGanDeal;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        cangGanDeal.deal(paipanRunDTO);
    }
}
