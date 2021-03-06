package com.example.springcloudprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages="controller")
@EnableDiscoveryClient  //注册服务到注册中心去
public class ProviderRun_2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderRun_2.class, args);
    }

}
