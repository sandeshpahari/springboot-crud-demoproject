///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.f1soft.springrest.filter;
//
//import java.io.IOException;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
// */
//@Component
//public class SecureFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("This is student filter");
//        System.out.println("Local Port: " + request.getLocalPort());
//        System.out.println("Server Name: " + request.getServerName());
//        HttpServletRequest req = (HttpServletRequest) request;
//        System.out.println("Method : " + req.getMethod());
//        System.out.println("Request URI: " + req.getRequestURI());
//
//        String xAuth = req.getHeader("Key");
//
//        if (xAuth.equals("sandy") == false) {
//            throw new ServletException();
//        }
//
//        chain.doFilter(request, response);
//
//    }
//}
