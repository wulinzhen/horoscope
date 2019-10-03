package com.boc.horoscope.platoon.service.impl;

import com.boc.horoscope.horos.mapper.HsEightDiagramsMapper;
import com.boc.horoscope.horos.po.HsEightDiagrams;
import com.boc.horoscope.platoon.service.HsEightDiagramsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HsEightDiagramsServiceImpl implements HsEightDiagramsService {
    @Autowired
    private HsEightDiagramsMapper hsEightDiagramsMapper;
    @Override
    public HsEightDiagrams selectHsEightDiagramsById(Integer id) {
        return hsEightDiagramsMapper.selectByPrimaryKey(id);
    }
}
