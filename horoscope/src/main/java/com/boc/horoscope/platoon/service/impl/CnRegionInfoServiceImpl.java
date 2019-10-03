package com.boc.horoscope.platoon.service.impl;

import com.boc.horoscope.horos.mapper.CnRegionInfoMapper;
import com.boc.horoscope.horos.po.CnRegionInfo;
import com.boc.horoscope.platoon.service.CnRegionInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CnRegionInfoServiceImpl implements CnRegionInfoService {

    @Autowired
    private CnRegionInfoMapper cnRegionInfoMapper;

    @Override
    public List<CnRegionInfo> selectBySuperCriCode(String superiorCode) {
        if (StringUtils.isBlank(superiorCode)){
            superiorCode = "000000";
        }
        return cnRegionInfoMapper.selectBySuperCriCode(superiorCode);
    }
}
