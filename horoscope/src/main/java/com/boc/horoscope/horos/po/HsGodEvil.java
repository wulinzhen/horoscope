package com.boc.horoscope.horos.po;

public class HsGodEvil {
    /**
     *
     */
    private Integer id;

    /**
     * 主元素
     */
    private String mainElement;

    /**
     * 关系元素
     */
    private String relElement;

    /**
     * 1-年支神煞，2-日干神煞，3-月支神煞，4-日支神煞
     */
    private Integer mainType;

    /**
     * 神煞
     */
    private String godEvil;

    /**
     * 含义
     */
    private String description;

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
     * 主元素
     * @return main_element 主元素
     */
    public String getMainElement() {
        return mainElement;
    }

    /**
     * 主元素
     * @param mainElement 主元素
     */
    public void setMainElement(String mainElement) {
        this.mainElement = mainElement == null ? null : mainElement.trim();
    }

    /**
     * 关系元素
     * @return rel_element 关系元素
     */
    public String getRelElement() {
        return relElement;
    }

    /**
     * 关系元素
     * @param relElement 关系元素
     */
    public void setRelElement(String relElement) {
        this.relElement = relElement == null ? null : relElement.trim();
    }

    /**
     * 1-年支神煞，2-日干神煞，3-月支神煞，4-日支神煞
     * @return main_type 1-年支神煞，2-日干神煞，3-月支神煞，4-日支神煞
     */
    public Integer getMainType() {
        return mainType;
    }

    /**
     * 1-年支神煞，2-日干神煞，3-月支神煞，4-日支神煞
     * @param mainType 1-年支神煞，2-日干神煞，3-月支神煞，4-日支神煞
     */
    public void setMainType(Integer mainType) {
        this.mainType = mainType;
    }

    /**
     * 神煞
     * @return god_evil 神煞
     */
    public String getGodEvil() {
        return godEvil;
    }

    /**
     * 神煞
     * @param godEvil 神煞
     */
    public void setGodEvil(String godEvil) {
        this.godEvil = godEvil == null ? null : godEvil.trim();
    }

    /**
     * 含义
     * @return description 含义
     */
    public String getDescription() {
        return description;
    }

    /**
     * 含义
     * @param description 含义
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}