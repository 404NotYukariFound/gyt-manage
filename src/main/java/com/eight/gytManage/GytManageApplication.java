package com.eight.gytManage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan("com.eight.gytManage.mapper")
public class GytManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GytManageApplication.class, args);
    }

}
