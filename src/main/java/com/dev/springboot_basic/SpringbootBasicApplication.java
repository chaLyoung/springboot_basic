package com.dev.springboot_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dev.springboot_basic.utill.StringUtil;

@SpringBootApplication
public class SpringbootBasicApplication {

    public static void main(String[] args) {
        String profile = StringUtil.nvl(System.getProperty("spring.profiles.active"), "local");
        System.setProperty("spring.profiles.active", profile);
        System.setProperty("service.name", "springboot_basic");
        SpringApplication.run(SpringbootBasicApplication.class, args);
    }

}
