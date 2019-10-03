package com.boc.horoscope.horos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boc.horoscope.horos.po.CnSolarTerm;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CnSolarTermMapper  extends BaseMapper<CnSolarTerm> {
    int deleteByPrimaryKey(Integer id);

    int insert(CnSolarTerm record);

    int insertSelective(CnSolarTerm record);

    int insertBatch(@Param("records") List<CnSolarTerm> records);

    CnSolarTerm selectByPrimaryKey(Integer id);

    List<CnSolarTerm> selectByYear(@Param("year") Integer year);

    int updateByPrimaryKeySelective(CnSolarTerm record);

    int updateByPrimaryKey(CnSolarTerm record);
}