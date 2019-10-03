package com.boc.horoscope.horos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boc.horoscope.horos.po.HsPersonHoroscopeRecd;
import org.springframework.stereotype.Repository;

@Repository
public interface HsPersonHoroscopeRecdMapper extends BaseMapper<HsPersonHoroscopeRecd>{
    int deleteByPrimaryKey(String id);

    int insert(HsPersonHoroscopeRecd record);

    int insertSelective(HsPersonHoroscopeRecd record);

    HsPersonHoroscopeRecd selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HsPersonHoroscopeRecd record);

    int updateByPrimaryKey(HsPersonHoroscopeRecd record);
}