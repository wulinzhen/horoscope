package com.boc.horoscope.paipan.dayun.liunian;

import com.boc.horoscope.paipan.dayun.DaYunDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.util.IntegerUtil;
import com.boc.horoscope.paipan.yearcolumn.YearBranchEnum;
import com.boc.horoscope.paipan.yearcolumn.YearHeavenlyEnum;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultLiuNianDeal implements LiuNianDeal {
    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        List<DaYunDTO> daYunDTOS = paipanRunDTO.getDaYunDTOS();
        if (CollectionUtils.isEmpty(daYunDTOS)){
            return;
        }
        daYunDTOS.stream().forEach(this::makeOneDaYunLiuNian);
    }

    private void makeOneDaYunLiuNian(DaYunDTO daYunDTO){
        String dayunDate = daYunDTO.getDayunDate();
        String yearStr = dayunDate.trim().split("-")[0];
        int year = IntegerUtil.parseInt(yearStr);
        List<String> liuNians = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int heavenlyNum = (year+i) % 10;
            int branchNum = (year+i) % 12;
            String heavenly = YearHeavenlyEnum.getByCode(heavenlyNum).getHeavenly();
            String branch = YearBranchEnum.getByCode(branchNum).getBranch();
            liuNians.add(heavenly+branch);
        }
        daYunDTO.setLiuNian(liuNians);
    }
}
