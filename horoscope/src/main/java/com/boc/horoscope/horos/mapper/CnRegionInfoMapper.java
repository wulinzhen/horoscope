package com.boc.horoscope.horos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boc.horoscope.horos.po.CnRegionInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CnRegionInfoMapper extends BaseMapper<CnRegionInfo>{
    int deleteByPrimaryKey(Integer criId);

    int insert(CnRegionInfo record);

    int insertSelective(CnRegionInfo record);

    CnRegionInfo selectByPrimaryKey(Integer criId);

    CnRegionInfo selectByCriCode(@Param("criCode") String criCode);

    List<CnRegionInfo> selectBySuperCriCode(@Param("superiorCode") String superiorCode);

    int updateByPrimaryKeySelective(CnRegionInfo record);

    int updateByPrimaryKey(CnRegionInfo record);
}