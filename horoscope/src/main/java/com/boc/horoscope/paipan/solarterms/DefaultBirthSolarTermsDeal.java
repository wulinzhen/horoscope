package com.boc.horoscope.paipan.solarterms;

import com.boc.horoscope.horos.mapper.CnSolarTermMapper;
import com.boc.horoscope.horos.po.CnSolarTerm;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.util.DateUtil;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.boc.horoscope.paipan.util.DateUtil.YYYY_MM_DD_HH_MM;

@Component
public class DefaultBirthSolarTermsDeal implements BirthSolarTermsDeal {

    @Autowired
    private CnSolarTermMapper cnSolarTermMapper;

    @Override
    public void deal(PaipanRunDTO paipanRunDTO) {
        String trueSunbirthDateTime = paipanRunDTO.getPaipanDTO().getTrueSunbirthDateTime();
        Date date = DateUtil.parseDate(trueSunbirthDateTime,YYYY_MM_DD_HH_MM);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int year1 = year - 1;
        List<CnSolarTerm> currYears = cnSolarTermMapper.selectByYear(year);
        List<CnSolarTerm> preYears = cnSolarTermMapper.selectByYear(year1);
        int solarYear = 0;
        int termIdx = 0;
        if (date.getTime() < currYears.get(0).getTermDate().getTime()){
            for (int i = 0; i < preYears.size(); i++) {
                CnSolarTerm cnSolarTerm = preYears.get(i);
                termIdx = cnSolarTerm.getTermIndex();
                solarYear = year1;
                paipanRunDTO.setCurrSolarTerm(cnSolarTerm);
                if (date.getTime() < cnSolarTerm.getTermDate().getTime()){
                    break;
                }
            }
        }else {
            for (int i = currYears.size()-1; i >= 0; i--) {
                CnSolarTerm cnSolarTerm = currYears.get(i);
                if (date.getTime() >= cnSolarTerm.getTermDate().getTime()){
                    solarYear = year;
                    termIdx = cnSolarTerm.getTermIndex();
                    paipanRunDTO.setCurrSolarTerm(cnSolarTerm);
                    break;
                }
            }
        }
        paipanRunDTO.setSolarTermIdx(termIdx);
        paipanRunDTO.setSolarYear(solarYear);

        //设置下一节气时间，上一年0-21节气,则向后取一个节气
        if (solarYear == year1 && termIdx < 22){
            paipanRunDTO.setNextSolarTerm(preYears.get(termIdx/2*2+2));
            paipanRunDTO.setPreSolarTerm(preYears.get(termIdx/2*2));
        }
        //上一年22,23节气，则取下一年第一个节气
        else if (solarYear == year1 && termIdx >= 22){
            paipanRunDTO.setNextSolarTerm(currYears.get(0));
            paipanRunDTO.setPreSolarTerm(preYears.get(termIdx/2*2));
        }
        //本年0-21节气，则向后取一个节气
        else if (solarYear == year && termIdx < 22){
            if (termIdx == 0){
                paipanRunDTO.setPreSolarTerm(preYears.get(0));
            }else {
                paipanRunDTO.setPreSolarTerm(currYears.get(termIdx/2*2));
            }
            paipanRunDTO.setNextSolarTerm(currYears.get(termIdx/2*2+2));
        }
        //本年22,23节气，则取下一年第一个节气
        else if (solarYear == year && termIdx >= 22){
            List<CnSolarTerm> nextYears = cnSolarTermMapper.selectByYear(year);
            paipanRunDTO.setNextSolarTerm(nextYears.get(0));
            paipanRunDTO.setPreSolarTerm(currYears.get(termIdx/2*2));
        }

    }
}
