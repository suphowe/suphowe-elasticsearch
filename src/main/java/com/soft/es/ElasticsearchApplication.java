package com.soft.es;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * elasticsearch 启动类
 * @author suphowe
 */
@SpringBootApplication
@Slf4j
public class ElasticsearchApplication {

    public static void main(String[] args) {
        log.info("===>主线程");
        SpringApplication.run(ElasticsearchApplication.class, args);
    }

}
