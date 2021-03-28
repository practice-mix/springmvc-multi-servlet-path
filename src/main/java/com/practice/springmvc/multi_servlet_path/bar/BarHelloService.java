package com.practice.springmvc.multi_servlet_path.bar;

import org.springframework.stereotype.Service;

@Service
public class BarHelloService {

    public String hello(String username) {
        return this.getClass().getSimpleName() + ",hello," + username;
    }
}
