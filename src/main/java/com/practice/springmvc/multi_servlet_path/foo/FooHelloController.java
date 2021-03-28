package com.practice.springmvc.multi_servlet_path.foo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FooHelloController {
    private final FooHelloService helloService;

    public FooHelloController(FooHelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    public Map<String, String> hello(HttpServletRequest request, WebRequest webRequest) {
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        Map<String, String> map = new HashMap<>();
        map.put("greeting", helloService.hello(this.getClass().getSimpleName()));

        map.put("contextPath", contextPath);
        map.put("servletPath", servletPath);
        return map;
    }
}
