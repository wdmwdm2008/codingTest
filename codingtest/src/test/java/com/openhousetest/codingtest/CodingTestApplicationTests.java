package com.openhousetest.codingtest;

import com.demo.controller.MatchController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodingTestApplicationTests {

    @Resource
    MatchController matchController;
    @Test
    public void contextLoads() {
        System.out.print(matchController.getMatchResultByString("dream"));
    }
}
