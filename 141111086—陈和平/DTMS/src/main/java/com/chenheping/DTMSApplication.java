package com.chenheping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Chenhp on 2018/3/20 0020.
 */
@SpringBootApplication
@ComponentScan
@EnableScheduling
@MapperScan("com.chenheping.DAO")
public class DTMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(DTMSApplication.class,args);
    }
}
