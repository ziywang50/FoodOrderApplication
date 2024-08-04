package com.laioffer.onlineorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaiApplication.class, args);
    }

}

