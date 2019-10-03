package com.boc.horoscope.horos.po;

import java.util.Date;

public class HsPersonHoroscopeRecd {
    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别1-男2-女
     */
    private Integer sex;

    /**
     *
     */
    private String eightCharacter;

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
    private String hoursHeavenly;

    /**
     * 时支
     */
    private String hoursBranch;

    /**
     * 大运
     */
    private String bigLuck;

    /**
     * 子平格局
     */
    private String ziPingPattern;

    /**
     * 批命要点
     */
    private String commentMain;

    /**
     * 主要经历
     */
    private String mainExperience;

    /**
     * 生辰时间
     */
    private Date birthDateTime;

    /**
     * 主键
     * @return id 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 性别1-男2-女
     * @return sex 性别1-男2-女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别1-男2-女
     * @param sex 性别1-男2-女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     *
     * @return eight_character
     */
    public String getEightCharacter() {
        return eightCharacter;
    }

    /**
     *
     * @param eightCharacter
     */
    public void setEightCharacter(String eightCharacter) {
        this.eightCharacter = eightCharacter == null ? null : eightCharacter.trim();
    }

    /**
     * 年干
     * @return year_heavenly 年干
     */
    public String getYearHeavenly() {
        return yearHeavenly;
    }

    /**
     * 年干
     * @param yearHeavenly 年干
     */
    public void setYearHeavenly(String yearHeavenly) {
        this.yearHeavenly = yearHeavenly == null ? null : yearHeavenly.trim();
    }

    /**
     * 年支
     * @return year_branch 年支
     */
    public String getYearBranch() {
        return yearBranch;
    }

    /**
     * 年支
     * @param yearBranch 年支
     */
    public void setYearBranch(String yearBranch) {
        this.yearBranch = yearBranch == null ? null : yearBranch.trim();
    }

    /**
     * 月干
     * @return month_heavenly 月干
     */
    public String getMonthHeavenly() {
        return monthHeavenly;
    }

    /**
     * 月干
     * @param monthHeavenly 月干
     */
    public void setMonthHeavenly(String monthHeavenly) {
        this.monthHeavenly = monthHeavenly == null ? null : monthHeavenly.trim();
    }

    /**
     * 月支
     * @return month_branch 月支
     */
    public String getMonthBranch() {
        return monthBranch;
    }

    /**
     * 月支
     * @param monthBranch 月支
     */
    public void setMonthBranch(String monthBranch) {
        this.monthBranch = monthBranch == null ? null : monthBranch.trim();
    }

    /**
     * 日干
     * @return day_heavenly 日干
     */
    public String getDayHeavenly() {
        return dayHeavenly;
    }

    /**
     * 日干
     * @param dayHeavenly 日干
     */
    public void setDayHeavenly(String dayHeavenly) {
        this.dayHeavenly = dayHeavenly == null ? null : dayHeavenly.trim();
    }

    /**
     * 日支
     * @return day_branch 日支
     */
    public String getDayBranch() {
        return dayBranch;
    }

    /**
     * 日支
     * @param dayBranch 日支
     */
    public void setDayBranch(String dayBranch) {
        this.dayBranch = dayBranch == null ? null : dayBranch.trim();
    }

    /**
     * 时干
     * @return hours_heavenly 时干
     */
    public String getHoursHeavenly() {
        return hoursHeavenly;
    }

    /**
     * 时干
     * @param hoursHeavenly 时干
     */
    public void setHoursHeavenly(String hoursHeavenly) {
        this.hoursHeavenly = hoursHeavenly == null ? null : hoursHeavenly.trim();
    }

    /**
     * 时支
     * @return hours_branch 时支
     */
    public String getHoursBranch() {
        return hoursBranch;
    }

    /**
     * 时支
     * @param hoursBranch 时支
     */
    public void setHoursBranch(String hoursBranch) {
        this.hoursBranch = hoursBranch == null ? null : hoursBranch.trim();
    }

    /**
     * 大运
     * @return big_luck 大运
     */
    public String getBigLuck() {
        return bigLuck;
    }

    /**
     * 大运
     * @param bigLuck 大运
     */
    public void setBigLuck(String bigLuck) {
        this.bigLuck = bigLuck == null ? null : bigLuck.trim();
    }

    /**
     * 子平格局
     * @return zi_ping_pattern 子平格局
     */
    public String getZiPingPattern() {
        return ziPingPattern;
    }

    /**
     * 子平格局
     * @param ziPingPattern 子平格局
     */
    public void setZiPingPattern(String ziPingPattern) {
        this.ziPingPattern = ziPingPattern == null ? null : ziPingPattern.trim();
    }

    /**
     * 批命要点
     * @return comment_main 批命要点
     */
    public String getCommentMain() {
        return commentMain;
    }

    /**
     * 批命要点
     * @param commentMain 批命要点
     */
    public void setCommentMain(String commentMain) {
        this.commentMain = commentMain == null ? null : commentMain.trim();
    }

    /**
     * 主要经历
     * @return main_experience 主要经历
     */
    public String getMainExperience() {
        return mainExperience;
    }

    /**
     * 主要经历
     * @param mainExperience 主要经历
     */
    public void setMainExperience(String mainExperience) {
        this.mainExperience = mainExperience == null ? null : mainExperience.trim();
    }

    /**
     * 生辰时间
     * @return birth_date_time 生辰时间
     */
    public Date getBirthDateTime() {
        return birthDateTime;
    }

    /**
     * 生辰时间
     * @param birthDateTime 生辰时间
     */
    public void setBirthDateTime(Date birthDateTime) {
        this.birthDateTime = birthDateTime;
    }
}