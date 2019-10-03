package com.boc.horoscope.paipan.solarterms;

import com.boc.horoscope.BaseJunit4Test;
import com.boc.horoscope.paipan.solarterms.init.InitSolarTerms;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class InitSolarTermsTest extends BaseJunit4Test{

    @Autowired
    private InitSolarTerms initSolarTerms;

    @Test
    public void makeAndInsertTerms()  {
        for (int i = 1800; i < 2200; i++) {
            initSolarTerms.makeAndInsertTerms(i);
        }

    }

}