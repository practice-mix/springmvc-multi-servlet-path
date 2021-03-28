package com.practice.springmvc.multi_servlet_path.defaul;

import com.practice.springmvc.multi_servlet_path.bar.BarConfig;
import com.practice.springmvc.multi_servlet_path.foo.FooConfig;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class MultiServletPathConfig {
    @Bean
    public ServletRegistrationBean foo() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(FooConfig.class);
        dispatcherServlet.setApplicationContext(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/foo/*");
        servletRegistrationBean.setName("foo");
        return servletRegistrationBean;
    }
    @Bean
    public ServletRegistrationBean bar() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(BarConfig.class);
        dispatcherServlet.setApplicationContext(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/bar/*");
        servletRegistrationBean.setName("bar");
        return servletRegistrationBean;
    }
}
