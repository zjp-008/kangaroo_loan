package com.kabgaroo.loan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 789456
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.kabgaroo.loan"})
@MapperScan(basePackages = "com.kabgaroo.loan.dao")
public class GatawayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatawayApplication.class, args);
        System.out.println("完成!");

    }

}
