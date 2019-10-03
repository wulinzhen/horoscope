package com.boc.horoscope.paipan.solarterms.init;

import com.boc.horoscope.horos.mapper.CnSolarTermMapper;
import com.boc.horoscope.horos.po.CnSolarTerm;
import com.boc.horoscope.paipan.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.boc.horoscope.paipan.solarterms.init.SolarTerms.jqB;
import static com.boc.horoscope.paipan.util.DateUtil.YYYY_MM_DD_HH_MM_SS;

@Component
public class InitSolarTerms {
    @Autowired
    private CnSolarTermMapper cnSolarTermMapper;

    public void makeAndInsertTerms(int year){
        List<CnSolarTerm> cnSolarTerms = new ArrayList<>();
        SolarTerms st = new SolarTerms();
        for (int i = 0; i < 24; i++) {
            CnSolarTerm cnSolarTerm = new CnSolarTerm();
            String term = st.getTerm(year, i);
            Date date = DateUtil.parseDate(term,YYYY_MM_DD_HH_MM_SS);
            cnSolarTerm.setTermDate(date);
            cnSolarTerm.setTermName(jqB[i]);
            int year2 = year;
            int idx = i;
            if (i >= 21){
                year2 = year + 1;
                idx = i - 21;
            }else {
                year2 = year ;
                idx = i + 3;
            }
            cnSolarTerm.setYear(year2);
            cnSolarTerm.setTermIndex(idx);
            cnSolarTerm.setId(year2*100+idx);
            cnSolarTerms.add(cnSolarTerm);
        }
        cnSolarTermMapper.insertBatch(cnSolarTerms);
    }
}
