package com.practice.springmvc.multi_servlet_path.bar;

import com.practice.springmvc.multi_servlet_path.defaul.DefaultHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BarHelloController {
    private final BarHelloService helloService;
    private final DefaultHelloService defaultHelloService;

    public BarHelloController(BarHelloService helloService, DefaultHelloService defaultHelloService) {
        this.helloService = helloService;
        this.defaultHelloService = defaultHelloService;
    }

    @RequestMapping("/hello")
    public Map<String, String> hello(HttpServletRequest request, WebRequest webRequest) {
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        Map<String, String> map = new HashMap<>();
        map.put("greeting", helloService.hello(this.getClass().getSimpleName()));
        map.put("defaultHelloService", defaultHelloService.hello(this.getClass().getSimpleName()));
        map.put("contextPath", contextPath);
        map.put("servletPath", servletPath);
        return map;
    }
}
