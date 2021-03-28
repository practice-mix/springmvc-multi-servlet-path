package com.practice.springmvc.multi_servlet_path.defaul;

import org.springframework.stereotype.Service;

@Service
public class DefaultHelloService {

    public String hello(String username) {
        return this.getClass().getSimpleName() + ",hello," + username;
    }
}
