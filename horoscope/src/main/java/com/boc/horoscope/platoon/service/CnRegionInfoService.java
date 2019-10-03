package com.boc.horoscope.platoon.service;

import com.boc.horoscope.horos.po.CnRegionInfo;

import java.util.List;

public interface CnRegionInfoService {
    List<CnRegionInfo> selectBySuperCriCode(String superiorCode);
}
