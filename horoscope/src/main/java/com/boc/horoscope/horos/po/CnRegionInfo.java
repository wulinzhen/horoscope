package com.boc.horoscope.horos.po;

import java.util.Date;

public class CnRegionInfo {
    /**
     * 自增ID
     */
    private Integer criId;

    /**
     * 代码
     */
    private String criCode;

    /**
     * 名称
     */
    private String criName;

    /**
     * 简称
     */
    private String criShortName;

    /**
     * 上级代码
     */
    private String criSuperiorCode;

    /**
     * 经度
     */
    private String criLng;

    /**
     * 纬度
     */
    private String criLat;

    /**
     * 排序
     */
    private Integer criSort;

    /**
     * 创建时间
     */
    private Date criGmtCreate;

    /**
     * 修改时间
     */
    private Date criGmtModified;

    /**
     * 备注
     */
    private String criMemo;

    /**
     * 状态
     */
    private Integer criDataState;

    /**
     * 租户ID
     */
    private String criTenantCode;

    /**
     * 级别
     */
    private String criLevel;

    /**
     * 自增ID
     * @return CRI_ID 自增ID
     */
    public Integer getCriId() {
        return criId;
    }

    /**
     * 自增ID
     * @param criId 自增ID
     */
    public void setCriId(Integer criId) {
        this.criId = criId;
    }

    /**
     * 代码
     * @return CRI_CODE 代码
     */
    public String getCriCode() {
        return criCode;
    }

    /**
     * 代码
     * @param criCode 代码
     */
    public void setCriCode(String criCode) {
        this.criCode = criCode == null ? null : criCode.trim();
    }

    /**
     * 名称
     * @return CRI_NAME 名称
     */
    public String getCriName() {
        return criName;
    }

    /**
     * 名称
     * @param criName 名称
     */
    public void setCriName(String criName) {
        this.criName = criName == null ? null : criName.trim();
    }

    /**
     * 简称
     * @return CRI_SHORT_NAME 简称
     */
    public String getCriShortName() {
        return criShortName;
    }

    /**
     * 简称
     * @param criShortName 简称
     */
    public void setCriShortName(String criShortName) {
        this.criShortName = criShortName == null ? null : criShortName.trim();
    }

    /**
     * 上级代码
     * @return CRI_SUPERIOR_CODE 上级代码
     */
    public String getCriSuperiorCode() {
        return criSuperiorCode;
    }

    /**
     * 上级代码
     * @param criSuperiorCode 上级代码
     */
    public void setCriSuperiorCode(String criSuperiorCode) {
        this.criSuperiorCode = criSuperiorCode == null ? null : criSuperiorCode.trim();
    }

    /**
     * 经度
     * @return CRI_LNG 经度
     */
    public String getCriLng() {
        return criLng;
    }

    /**
     * 经度
     * @param criLng 经度
     */
    public void setCriLng(String criLng) {
        this.criLng = criLng == null ? null : criLng.trim();
    }

    /**
     * 纬度
     * @return CRI_LAT 纬度
     */
    public String getCriLat() {
        return criLat;
    }

    /**
     * 纬度
     * @param criLat 纬度
     */
    public void setCriLat(String criLat) {
        this.criLat = criLat == null ? null : criLat.trim();
    }

    /**
     * 排序
     * @return CRI_SORT 排序
     */
    public Integer getCriSort() {
        return criSort;
    }

    /**
     * 排序
     * @param criSort 排序
     */
    public void setCriSort(Integer criSort) {
        this.criSort = criSort;
    }

    /**
     * 创建时间
     * @return CRI_GMT_CREATE 创建时间
     */
    public Date getCriGmtCreate() {
        return criGmtCreate;
    }

    /**
     * 创建时间
     * @param criGmtCreate 创建时间
     */
    public void setCriGmtCreate(Date criGmtCreate) {
        this.criGmtCreate = criGmtCreate;
    }

    /**
     * 修改时间
     * @return CRI_GMT_MODIFIED 修改时间
     */
    public Date getCriGmtModified() {
        return criGmtModified;
    }

    /**
     * 修改时间
     * @param criGmtModified 修改时间
     */
    public void setCriGmtModified(Date criGmtModified) {
        this.criGmtModified = criGmtModified;
    }

    /**
     * 备注
     * @return CRI_MEMO 备注
     */
    public String getCriMemo() {
        return criMemo;
    }

    /**
     * 备注
     * @param criMemo 备注
     */
    public void setCriMemo(String criMemo) {
        this.criMemo = criMemo == null ? null : criMemo.trim();
    }

    /**
     * 状态
     * @return CRI_DATA_STATE 状态
     */
    public Integer getCriDataState() {
        return criDataState;
    }

    /**
     * 状态
     * @param criDataState 状态
     */
    public void setCriDataState(Integer criDataState) {
        this.criDataState = criDataState;
    }

    /**
     * 租户ID
     * @return CRI_TENANT_CODE 租户ID
     */
    public String getCriTenantCode() {
        return criTenantCode;
    }

    /**
     * 租户ID
     * @param criTenantCode 租户ID
     */
    public void setCriTenantCode(String criTenantCode) {
        this.criTenantCode = criTenantCode == null ? null : criTenantCode.trim();
    }

    /**
     * 级别
     * @return CRI_LEVEL 级别
     */
    public String getCriLevel() {
        return criLevel;
    }

    /**
     * 级别
     * @param criLevel 级别
     */
    public void setCriLevel(String criLevel) {
        this.criLevel = criLevel == null ? null : criLevel.trim();
    }
}