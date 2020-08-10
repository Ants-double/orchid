package com.ants.orchid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.ants.orchid.mapper")
public class OrchidApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrchidApplication.class, args);
    }

}
