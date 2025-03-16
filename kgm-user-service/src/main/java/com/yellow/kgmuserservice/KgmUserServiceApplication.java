package com.yellow.kgmuserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yellow.kgmuserservice.mapper")
public class KgmUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(KgmUserServiceApplication.class, args);
    }
}
