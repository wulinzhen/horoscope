package com.boc.horoscope.paipan.kongwang;

import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.hourcolumn.HourBranchEnum;
import com.boc.horoscope.paipan.monthcolumn.MonthHeavenlyEnum;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MonthHeavenlyEnum
 */
@Service
public class DefaultKongWangDeal implements KongWangDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        EightCharacterDTO eightCharacterDTO = paipanRunDTO.getEightCharacterDTO();
        String dayHeavenly =  eightCharacterDTO.getDayHeavenly();
        String dayBranch =  eightCharacterDTO.getDayBranch();
        HourBranchEnum branch = HourBranchEnum.getByBranch(dayBranch);
        MonthHeavenlyEnum heavenly = MonthHeavenlyEnum.getByHeavenly(dayHeavenly);
        int dif = branch.getCode() - heavenly.getCode() + 12;
        int dif2 =dif - 1;
        HourBranchEnum branch1 = HourBranchEnum.getByCode(dif);
        HourBranchEnum branch2 = HourBranchEnum.getByCode(dif2);
        List<String> kongWang = eightCharacterDTO.getKongWang();
        kongWang.add(branch1.getBranch());
        kongWang.add(branch2.getBranch());
    }
}
