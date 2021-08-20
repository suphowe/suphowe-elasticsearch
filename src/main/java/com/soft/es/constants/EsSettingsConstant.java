package com.soft.es.constants;

/**
 * elasticsearch 静态变量
 * @author suphowe
 */
public class EsSettingsConstant {

    /**
     * 数据分片数
     */
    public final static String NUMBER_OF_SHARDS = "index.number_of_shards";

    /**
     * 数据备份数
     */
    public final static String NUMBER_OF_REPLICAS = "index.number_of_replicas";

    /**
     * 分页查询es限制最大条数
     */
    public final static String MAX_RESULT_WINDOW = "index.max_result_window";

    /**
     * 最大一亿
     */
    public final static String MAX_RESULT_WINDOW_VALUE = "100000000";

}
