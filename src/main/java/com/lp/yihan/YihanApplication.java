package com.lp.yihan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(value = "com.lp.yihan.dao")
@SpringBootApplication
public class YihanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YihanApplication.class, args);
    }

}
