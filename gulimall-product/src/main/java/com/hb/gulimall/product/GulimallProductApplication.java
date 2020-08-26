package com.hb.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 整合MyBatis-Plus
 *  1).导入依赖
 *  2).配置
 *      1).配置数据源
 *          1).导入数据库驱动
 *      2).配置mybatis-plus
 *          1).使用@mapperScan
 *          2).告诉MyBatis-Plus，sql映射文件位置
 */
@MapperScan("com.hb.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
