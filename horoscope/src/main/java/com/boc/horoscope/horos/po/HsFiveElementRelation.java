package com.boc.horoscope.horos.po;

public class HsFiveElementRelation {
    /**
     * 
     */
    private String mainFiveElement;

    /**
     * 
     */
    private String relFiveElement;

    /**
     * 
     */
    private String reltion;

    /**
     * 
     */
    private String tenGod;

    /**
     * 
     * @return main_five_element 
     */
    public String getMainFiveElement() {
        return mainFiveElement;
    }

    /**
     * 
     * @param mainFiveElement 
     */
    public void setMainFiveElement(String mainFiveElement) {
        this.mainFiveElement = mainFiveElement == null ? null : mainFiveElement.trim();
    }

    /**
     * 
     * @return rel_five_element 
     */
    public String getRelFiveElement() {
        return relFiveElement;
    }

    /**
     * 
     * @param relFiveElement 
     */
    public void setRelFiveElement(String relFiveElement) {
        this.relFiveElement = relFiveElement == null ? null : relFiveElement.trim();
    }

    /**
     * 
     * @return reltion 
     */
    public String getReltion() {
        return reltion;
    }

    /**
     * 
     * @param reltion 
     */
    public void setReltion(String reltion) {
        this.reltion = reltion == null ? null : reltion.trim();
    }

    /**
     * 
     * @return ten_god 
     */
    public String getTenGod() {
        return tenGod;
    }

    /**
     * 
     * @param tenGod 
     */
    public void setTenGod(String tenGod) {
        this.tenGod = tenGod == null ? null : tenGod.trim();
    }
}