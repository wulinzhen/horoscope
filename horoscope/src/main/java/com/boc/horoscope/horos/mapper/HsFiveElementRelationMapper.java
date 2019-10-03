package com.boc.horoscope.horos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boc.horoscope.horos.po.HsFiveElementRelation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HsFiveElementRelationMapper extends BaseMapper<HsFiveElementRelation>{
    int insert(HsFiveElementRelation record);

    int insertSelective(HsFiveElementRelation record);

    List<HsFiveElementRelation> selectAll();
}