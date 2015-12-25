package com.ilodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring 入口类
 * @author 常学军
 * @since jdk1.8
 * 2015-07-19
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
//@EnableWebMvc
@ComponentScan
@ImportResource(value="classpath:xmlconfig/spring.xml")
public class Application {
    public static void main(String[] args) {
//    	ApplicationContext ctx = new ClassPathXmlApplicationContext("xmlconfig/spring.xml");
    	SpringApplication.run(Application.class,args);
    }						
}	

/**
 * spring 配置类
 * @author 常学军
 * @since jdk1.8
 * 2015-07-19
 *
 */
//@Configuration  
//class Config {  
//    @Bean  
//    public EmbeddedServletContainerFactory servletContainer() {  
//        return new TomcatEmbeddedServletContainerFactory();  
//    }  
//}