package com.boc.horoscope.paipan.factory;

import com.boc.horoscope.paipan.dto.PaipanDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

@Service
public class PaiPanRunDTOFactory implements FactoryBean<PaipanRunDTO> {
    @Nullable
    @Override
    public PaipanRunDTO getObject() throws Exception {
        return null;
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return PaipanRunDTO.class;
    }

    public PaipanRunDTO getObject(PaipanDTO paipanDTO){
        PaipanRunDTO paipanRunDTO = new PaipanRunDTO();
        paipanRunDTO.setPaipanDTO(paipanDTO);
        return paipanRunDTO;
    }
}
