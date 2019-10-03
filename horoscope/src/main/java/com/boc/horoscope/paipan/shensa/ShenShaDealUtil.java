package com.boc.horoscope.paipan.shensa;

import com.boc.horoscope.horos.mapper.HsGodEvilMapper;
import com.boc.horoscope.horos.po.HsGodEvil;
import com.boc.horoscope.paipan.dto.EightCharacterDTO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShenShaDealUtil {

    @Autowired
    private HsGodEvilMapper hsGodEvilMapper;

    public void setShenSha(EightCharacterDTO eightCharacterDTO, int mainType, int type) {
        String mainEle = eightCharacterDTO.getDayHeavenly();
        //1-年支神煞，2-日干神煞，3-月支神煞，4-日支神煞
        switch (mainType) {
            case 1:
                mainEle = eightCharacterDTO.getYearBranch();
                break;
            case 2:
                mainEle = eightCharacterDTO.getDayHeavenly();
                break;
            case 3:
                mainEle = eightCharacterDTO.getMonthBranch();
                break;
            case 4:
                mainEle = eightCharacterDTO.getDayBranch();
                break;
            default:
                return;
        }
        String relEle = "";
        List<String> yearShenShas = null;
        //1-年柱神煞，2-月柱神煞，3-日柱神煞，4-时柱神煞
        switch (type) {
            case 1:
                relEle = eightCharacterDTO.getYearBranch();
                yearShenShas = eightCharacterDTO.getYearShenShas();
                break;
            case 2:
                relEle = eightCharacterDTO.getMonthBranch();
                yearShenShas = eightCharacterDTO.getMonthShenShas();
                break;
            case 3:
                relEle = eightCharacterDTO.getDayBranch();
                yearShenShas = eightCharacterDTO.getDayShenShas();
                break;
            case 4:
                relEle = eightCharacterDTO.getHourBranch();
                yearShenShas = eightCharacterDTO.getHourShenShas();
                break;
            default:
                return;
        }
        List<String> relEles = new ArrayList<>();
        relEles.add(relEle);
        List<HsGodEvil> hsGodEvils = hsGodEvilMapper.selectByMainAdndRelElement(mainEle, relEles,mainType);
        if (CollectionUtils.isEmpty(hsGodEvils)) {
            return;
        }
        for (HsGodEvil hsGodEvil : hsGodEvils) {
            String godEvil = hsGodEvil.getGodEvil();
            if (StringUtils.isNotBlank(godEvil)) {
                yearShenShas.add(godEvil);
            }
        }
    }
}
