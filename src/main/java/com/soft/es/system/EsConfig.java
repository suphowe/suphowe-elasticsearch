package com.soft.es.system;

import com.soft.es.constants.SysEsConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * es 配置类
 * @author suphowe
 */
@Configuration
@Slf4j
public class EsConfig {

    SysEsConstants sysEsConstants;

    /**
     * Bean name default  函数名字
     */
    @Bean(name = "restHighLevelClient")
    public RestHighLevelClient restHighLevelClient() {
        log.info("Elasticsearch初始化开始>>>>>>>>>>");
        RestHighLevelClient restHighLevelClient = null;
        try {
            restHighLevelClient = new RestHighLevelClient(
                    RestClient.builder(
                            new HttpHost(sysEsConstants.getEsHostName(), sysEsConstants.getEsHostPort(), sysEsConstants.getEsClusterName())
                    )
            );
        } catch (Exception e) {
            log.error("elasticsearch RestHighLevelClient create error!!", e);
        }
        return restHighLevelClient;
    }
}
