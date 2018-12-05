package com.example.timetask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Timetask启动类
 */
//@EnableScheduling定时任务使用注解
@EnableScheduling
@SpringBootApplication
public class TimetaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimetaskApplication.class, args);
    }
}
