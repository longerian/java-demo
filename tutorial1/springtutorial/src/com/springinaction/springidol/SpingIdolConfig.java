package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.misc.Perf;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
@Configuration
public class SpingIdolConfig {

    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }
}
