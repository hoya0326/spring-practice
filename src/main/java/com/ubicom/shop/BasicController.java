package com.ubicom.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;
import java.util.Date;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
        //return에 문자 그대로 보내줘
    String hello() {
        return "<h1>안녕하세요</h1>";
    }

    @GetMapping("/url")
    String url() {
        return "index.html";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
    return ZonedDateTime.now().toString();
    }
}
