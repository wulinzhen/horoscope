package com.boc.horoscope.paipan.tengod;

import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("defaultTenGodDeal")
public class DefaultTenGodDeal implements TenGodDeal{

    @Resource(name = "branchTenGodDeal")
    private TenGodDeal branchTenGodDeal;

    @Resource(name = "hevTenGodDeal")
    private TenGodDeal hevTenGodDeal;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        hevTenGodDeal.deal(paipanRunDTO);
        branchTenGodDeal.deal(paipanRunDTO);
    }
}
