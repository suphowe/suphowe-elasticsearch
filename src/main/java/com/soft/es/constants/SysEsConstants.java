package com.soft.es.constants;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * elasticsearch 配置项
 * @author suphowe
 */
@Component
@Data
@ToString
@PropertySource(value= {"classpath:properties/elasticsearch.properties"})
public class SysEsConstants{

    @Value("${elasticsearch.host.hostname}")
    String esHostName;

    @Value("${elasticsearch.host.port}")
    Integer esHostPort;

    @Value("${elasticsearch.host.pool}")
    Integer esPool;

    @Value("${elasticsearch.cluster.name}")
    String esClusterName;
}
