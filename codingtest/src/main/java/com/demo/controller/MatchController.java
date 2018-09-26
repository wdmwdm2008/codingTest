package com.demo.controller;

import com.demo.service.MatchService;
import com.demo.util.MatchResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
@RequestMapping("/match")
public class MatchController {
    @Resource
    MatchService matchService;

    @RequestMapping("/searchWords")
    @ResponseBody
    public MatchResult getMatchResultByString(String word){
        return matchService.getMatchResultByString(word);
    }
}
