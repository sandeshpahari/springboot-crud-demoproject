/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@Component
public class StudentInterceptorConfig extends WebMvcConfigurerAdapter{
    @Autowired
    StudentInterceptor studentInterceptor;
    public void addInterceptor(InterceptorRegistry interceptorRegistry){
        interceptorRegistry.addInterceptor(studentInterceptor);
    }}
