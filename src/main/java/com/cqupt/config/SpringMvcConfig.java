package com.cqupt.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
//创建SpringMVC的配置文件，加载Controller对应的Bean
@ContextConfiguration
@ComponentScan("com.cqupt.springmvc")//要扫描到controller
public class SpringMvcConfig {

}
