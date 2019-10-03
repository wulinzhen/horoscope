package com.boc.horoscope.horos.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "八卦信息")
public class HsEightDiagrams implements Serializable{
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 八卦名
     */
    @ApiModelProperty(value = "八卦名")
    private String name;

    /**
     * 方位
     */
    @ApiModelProperty(value = "方位")
    private String position;

    /**
     * 五行属性
     */
    @ApiModelProperty(value = "五行属性")
    private String fiveElement;

    /**
     * 宇宙观
     */
    @ApiModelProperty(value = "宇宙观")
    private String universe;

    /**
     * 父母观
     */
    @ApiModelProperty(value = "父母观")
    private String family;

    /**
     * 动物观
     */
    @ApiModelProperty(value = "动物观")
    private String animal;

    /**
     * 身体观
     */
    @ApiModelProperty(value = "身体观")
    private String body;

    /**
     * 运动观
     */
    @ApiModelProperty(value = "运动观")
    private String sports;

    /**
     * 八卦图像
     */
    @ApiModelProperty(value = "八卦图像")
    private byte[] img;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 八卦名
     * @return name 八卦名
     */
    public String getName() {
        return name;
    }

    /**
     * 八卦名
     * @param name 八卦名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 方位
     * @return position 方位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 方位
     * @param position 方位
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 五行属性
     * @return five_element 五行属性
     */
    public String getFiveElement() {
        return fiveElement;
    }

    /**
     * 五行属性
     * @param fiveElement 五行属性
     */
    public void setFiveElement(String fiveElement) {
        this.fiveElement = fiveElement == null ? null : fiveElement.trim();
    }

    /**
     * 宇宙观
     * @return universe 宇宙观
     */
    public String getUniverse() {
        return universe;
    }

    /**
     * 宇宙观
     * @param universe 宇宙观
     */
    public void setUniverse(String universe) {
        this.universe = universe == null ? null : universe.trim();
    }

    /**
     * 父母观
     * @return family 父母观
     */
    public String getFamily() {
        return family;
    }

    /**
     * 父母观
     * @param family 父母观
     */
    public void setFamily(String family) {
        this.family = family == null ? null : family.trim();
    }

    /**
     * 动物观
     * @return animal 动物观
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * 动物观
     * @param animal 动物观
     */
    public void setAnimal(String animal) {
        this.animal = animal == null ? null : animal.trim();
    }

    /**
     * 身体观
     * @return body 身体观
     */
    public String getBody() {
        return body;
    }

    /**
     * 身体观
     * @param body 身体观
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    /**
     * 运动观
     * @return sports 运动观
     */
    public String getSports() {
        return sports;
    }

    /**
     * 运动观
     * @param sports 运动观
     */
    public void setSports(String sports) {
        this.sports = sports == null ? null : sports.trim();
    }

    /**
     * 八卦图像
     * @return img 八卦图像
     */
    public byte[] getImg() {
        return img;
    }

    /**
     * 八卦图像
     * @param img 八卦图像
     */
    public void setImg(byte[] img) {
        this.img = img;
    }
}