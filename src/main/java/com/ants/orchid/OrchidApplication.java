package com.ants.orchid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableCaching
@SpringBootApplication
@EnableTransactionManagement
/// @EnableSwagger2
@MapperScan(basePackages = "com.ants.orchid.mapper")
public class OrchidApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrchidApplication.class, args);
    }

}
