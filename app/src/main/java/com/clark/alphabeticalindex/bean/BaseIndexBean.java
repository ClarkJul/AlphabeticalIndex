package com.clark.alphabeticalindex.bean;

import com.clark.alphabeticalindex.interfaces.ISupperInterface;

/**
 * <pre>
 * @author : No.1
 * @time : 2018/8/3.
 * @desciption :
 * @version :
 * </pre>
 */

public abstract class BaseIndexBean implements ISupperInterface {
    private String firstLetter;
    private String pinyin;

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    @Override
    public String getIndexTag() {
        return firstLetter;
    }

    /**
     * 需要排序的内容
     *
     * @return
     */
    public abstract String getOrderName();
}
