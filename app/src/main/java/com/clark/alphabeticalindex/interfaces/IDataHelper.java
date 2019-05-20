package com.clark.alphabeticalindex.interfaces;

import com.clark.alphabeticalindex.bean.BaseIndexBean;

import java.util.List;

public interface IDataHelper {
    /**
     * 数据转换 根据getorderName生成pinyin
     *
     * @param datas
     */
    void cover(List<? extends BaseIndexBean> datas);

    /**
     * 排序
     *
     * @param datas
     */
    void sortDatas(List<? extends BaseIndexBean> datas);

    /**
     * 排序并获取索引数据
     *
     * @param datas
     */
    void sortDatasAndGetIndex(List<? extends BaseIndexBean> datas, List<String> indexDatas);

    /**
     * 获取索引
     *
     * @param datas
     * @param indexDatas
     */
    void getIndex(List<? extends BaseIndexBean> datas, List<String> indexDatas);
}
