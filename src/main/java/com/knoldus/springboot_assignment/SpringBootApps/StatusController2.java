package com.knoldus.springboot_assignment.SpringBootApps;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class StatusController2 {

    @RequestMapping("/status")
    public String getTime(){

       return (ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }

    @GetMapping("/TimeZone")
    public  String getTimeZone(){
        return "Time zone in India (GMT+5:30)";
    }

}
