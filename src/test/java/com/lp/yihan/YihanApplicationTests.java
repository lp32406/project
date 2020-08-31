package com.lp.yihan;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YihanApplicationTests {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000000; i++) {
            System.out.println("你好"+ i);
        }
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println("最后的时间是：==========" + result+ "============");
    }

    @Test
    void contextLoads() {
    }

}
