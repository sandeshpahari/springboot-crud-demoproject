/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.aop;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Component
public class StudentScheduler {
    @Scheduled(cron = "*/30 * * * * *")
    public void cronJob(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        Date now = new Date();
//        String printDate = sdf.format(now);
//        System.out.println("Scheduling printing:......"+ printDate);
        
    }
}
