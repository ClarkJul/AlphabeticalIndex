package com.clark.alphabeticalindex.bean;


public class IndexBean extends BaseIndexBean {
    String text;
    boolean isIndex;

    public IndexBean(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isIndex() {
        return isIndex;
    }

    public void setIndex(boolean index) {
        isIndex = index;
    }

    @Override
    public String getOrderName() {
        return text;
    }
}
