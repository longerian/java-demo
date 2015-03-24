package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huifeng.hxl on 2015/3/5.
 */
@Configuration
public class HelloWorldConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

}
