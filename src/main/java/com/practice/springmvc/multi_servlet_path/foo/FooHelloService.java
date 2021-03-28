package com.practice.springmvc.multi_servlet_path.foo;

import org.springframework.stereotype.Service;

@Service
public class FooHelloService {

    public String hello(String username) {
        return this.getClass().getSimpleName() + ",hello," + username;
    }
}
