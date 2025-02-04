package com.shop.himall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//@MapperScan("com.shop.himall.product.dao")
@SpringBootApplication
public class HimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(HimallProductApplication.class, args);
    }

}
