package com.boc.horoscope.paipan.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class EightCharacterDTO implements Serializable{
    private static final long serialVersionUID = -4484270303146067298L;
    /**
     * 年干
     */
    private String yearHeavenly;
    /**
     * 年支
     */
    private String yearBranch;
    /**
     * 月干
     */
    private String monthHeavenly;
    /**
     * 月支
     */
    private String monthBranch;
    /**
     * 日干
     */
    private String dayHeavenly;
    /**
     * 日支
     */
    private String dayBranch;
    /**
     * 时干
     */
    private String hourHeavenly;
    /**
     * 时支
     */
    private String hourBranch;

    /**
     * 年支藏干
     */
    private List<String> yearBranchHevs;

    /**
     * 月支藏干
     */
    private List<String> monthBranchHevs;


    /**
     * 日支藏干
     */
    private List<String> dayBranchHevs;


    /**
     * 时支藏干
     */
    private List<String> hourBranchHevs;

    private String yearHevGod;

    private String monthHevGod;

    private String dayHevGod;

    private String hourHevGod;

    /**
     *  年支藏干
     */
    private List<String> yearBranchHevsGod;

    /**
     * 月支藏干
     */
    private List<String> monthBranchHevsGod;


    /**
     * 日支藏干
     */
    private List<String> dayBranchHevsGod;


    /**
     * 时支藏干
     */
    private List<String> hourBranchHevsGod;

    /**
     * 年柱纳音
     */
    private String yearNaYin;

    /**
     * 月柱纳音
     */
    private String monthNaYin;

    /**
     * 日柱纳音
     */
    private String dayNaYin;

    /**
     * 时柱纳音
     */
    private String hourNaYin;

    /**
     * 年支十二长生宫位
     */
    private String yearChangSheng;

    /**
     * 月支十二长生宫位
     */
    private String monthChangSheng;

    /**
     * 日支十二长生宫位
     */
    private String dayChangSheng;

    /**
     * 时支十二长生宫位
     */
    private String hourChangSheng;

    /**
     *  年柱神煞
     */
    private List<String> yearShenShas = new ArrayList<>();

    /**
     * 月柱神煞
     */
    private List<String> monthShenShas= new ArrayList<>();


    /**
     * 日柱神煞
     */
    private List<String> dayShenShas= new ArrayList<>();


    /**
     * 时柱神煞
     */
    private List<String> hourShenShas= new ArrayList<>();

    /**
     * 时柱神煞
     */
    private List<String> kongWang = new ArrayList<>();

    /**
     * 胎元天干
     */
    private String taiYuanHeavenly;


    /**
     * 胎元地支
     */
    private String taiYuanBranch;

    /**
     * 命宫起法地支（较正后）
     */
    private String mingGongStartBranch;


    /**
     * 命宫地支
     */
    private String mingGongBranch;


    /**
     * 命宫天干
     */
    private String mingGongHeavenly;

}
