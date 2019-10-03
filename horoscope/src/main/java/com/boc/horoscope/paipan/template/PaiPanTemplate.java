package com.boc.horoscope.paipan.template;

import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.stereotype.Service;

@Service("paiPanTemplate")
public abstract class PaiPanTemplate implements PaiPanModule {
    @Override
    public void paiPan(PaipanRunDTO paipanRunDTO) {
        paiPanProcess(paipanRunDTO);
    }
    public abstract void paiPanProcess(PaipanRunDTO paipanRunDTO) ;
}
