package com.boc.horoscope.horos.po;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class CnSolarTerm {
    /**
     *
     */
    private Integer id;

    /**
     * 年
     */
    private Integer year;

    /**
     * 节气序号
     */
    private Integer termIndex;

    /**
     * 节气名
     */
    private String termName;

    /**
     *
     */

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date termDate;

    /**
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 年
     * @return year 年
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 年
     * @param year 年
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 节气序号
     * @return term_index 节气序号
     */
    public Integer getTermIndex() {
        return termIndex;
    }

    /**
     * 节气序号
     * @param termIndex 节气序号
     */
    public void setTermIndex(Integer termIndex) {
        this.termIndex = termIndex;
    }

    /**
     * 节气名
     * @return term_name 节气名
     */
    public String getTermName() {
        return termName;
    }

    /**
     * 节气名
     * @param termName 节气名
     */
    public void setTermName(String termName) {
        this.termName = termName == null ? null : termName.trim();
    }

    /**
     *
     * @return term_date
     */
    public Date getTermDate() {
        return termDate;
    }

    /**
     *
     * @param termDate
     */
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }
}