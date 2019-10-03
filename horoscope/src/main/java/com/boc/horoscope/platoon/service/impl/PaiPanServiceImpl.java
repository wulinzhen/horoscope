package com.boc.horoscope.platoon.service.impl;

import com.boc.horoscope.paipan.dto.PaipanDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.paipan.factory.PaiPanRunDTOFactory;
import com.boc.horoscope.paipan.template.PaiPanModule;
import com.boc.horoscope.paipan.template.PaiPanTemplate;
import com.boc.horoscope.platoon.service.PaiPanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaiPanServiceImpl implements PaiPanService {

    @Autowired
    private PaiPanRunDTOFactory paiPanRunDTOFactory;

    @Resource(name = "defaultPaiPanTemplate")
    private PaiPanTemplate defaultPaiPanTemplate;

    @Override
    public PaipanRunDTO paiPan(PaipanDTO paipanDTO) {
        PaipanRunDTO paipanRunDTO = paiPanRunDTOFactory.getObject(paipanDTO);
        defaultPaiPanTemplate.paiPan(paipanRunDTO);
        return paipanRunDTO;
    }
}
