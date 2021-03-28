package com.practice.springmvc.multi_servlet_path.bar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@EnableWebMvc
@EnableAspectJAutoProxy
@EnableScheduling
public class BarConfig {


}
