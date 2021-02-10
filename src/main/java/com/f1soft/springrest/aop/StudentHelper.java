/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class StudentHelper {
    
    @Before("execution( public void doFilter())")
    public void exampleAop(){
        System.out.println("AOP successfully executed");
        
    }
}
