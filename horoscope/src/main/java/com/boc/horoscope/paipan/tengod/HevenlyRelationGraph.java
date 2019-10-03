package com.boc.horoscope.paipan.tengod;

import com.boc.horoscope.horos.mapper.HsFiveElementRelationMapper;
import com.boc.horoscope.horos.po.HsFiveElementRelation;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class HevenlyRelationGraph {

    private Map<String,HsFiveElementRelation> hsFiveElementRelationMap = new ConcurrentHashMap<>(100);

    @Autowired
    private HsFiveElementRelationMapper hsFiveElementRelationMapper;

    @PostConstruct
    public void init(){
        List<HsFiveElementRelation> hsFiveElementRelations = hsFiveElementRelationMapper.selectAll();
        hsFiveElementRelations.stream().forEach(hsFiveElementRelation -> {
            String mainFiveElement = hsFiveElementRelation.getMainFiveElement();
            String relFiveElement = hsFiveElementRelation.getRelFiveElement();
            hsFiveElementRelationMap.put(mainFiveElement+relFiveElement,hsFiveElementRelation);
        });
    }

    public HsFiveElementRelation getRelation(String hevBranch){
        return hsFiveElementRelationMap.get(hevBranch);
    }

}
