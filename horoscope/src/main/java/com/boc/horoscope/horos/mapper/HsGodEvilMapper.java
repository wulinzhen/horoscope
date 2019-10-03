package com.boc.horoscope.horos.mapper;

import com.boc.horoscope.horos.po.HsGodEvil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HsGodEvilMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsGodEvil record);

    int insertSelective(HsGodEvil record);

    HsGodEvil selectByPrimaryKey(Integer id);

    List<HsGodEvil> selectByMainAdndRelElement(@Param("mainEle") String mainEle,
                                               @Param("relEles") List<String> relEles,
                                               @Param("mainType") int mainType);

    int updateByPrimaryKeySelective(HsGodEvil record);

    int updateByPrimaryKey(HsGodEvil record);
}