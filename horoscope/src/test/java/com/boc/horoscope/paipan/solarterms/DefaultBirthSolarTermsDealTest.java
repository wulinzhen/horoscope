package com.boc.horoscope.paipan.solarterms;

import com.boc.horoscope.BaseJunit4Test;
import com.boc.horoscope.paipan.dto.PaipanDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DefaultBirthSolarTermsDealTest extends BaseJunit4Test{

    private static Logger logger = LoggerFactory.getLogger(DefaultBirthSolarTermsDealTest.class);

    @Autowired
    private DefaultBirthSolarTermsDeal defaultBirthSolarTermsDeal;
    @Test
    public void deal() {
        PaipanRunDTO paipanRunDTO = new PaipanRunDTO();
        PaipanDTO paipanDTO = new PaipanDTO();
        paipanDTO.setTrueSunbirthDateTime("1991-05-25 07:30");
        paipanRunDTO.setPaipanDTO(paipanDTO);
        defaultBirthSolarTermsDeal.deal(paipanRunDTO);
        logger.info("paipanRunDTO:{}",paipanRunDTO);

    }

}