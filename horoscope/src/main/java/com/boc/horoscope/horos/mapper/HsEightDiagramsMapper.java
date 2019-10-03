package com.boc.horoscope.horos.mapper;

import com.boc.horoscope.horos.po.HsEightDiagrams;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@Mapper
@CacheConfig(cacheNames = "hsEightDiagrams")
public interface HsEightDiagramsMapper {
    /**
     *
     * @mbggenerated 2018-12-23
     */
    @CacheEvict(key ="#p0",allEntries=true)
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-12-23
     */
    int insert(HsEightDiagrams record);

    /**
     *
     * @mbggenerated 2018-12-23
     */
    int insertSelective(HsEightDiagrams record);

    /**
     *
     * @mbggenerated 2018-12-23
     */
    @Cacheable(key ="#p0")
    HsEightDiagrams selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-12-23
     */
    @CachePut(key ="#record.id")
    int updateByPrimaryKeySelective(HsEightDiagrams record);

    /**
     *
     * @mbggenerated 2018-12-23
     */
    int updateByPrimaryKeyWithBLOBs(HsEightDiagrams record);

    /**
     *
     * @mbggenerated 2018-12-23
     */
    @CachePut(key ="#record.id")
    int updateByPrimaryKey(HsEightDiagrams record);
}