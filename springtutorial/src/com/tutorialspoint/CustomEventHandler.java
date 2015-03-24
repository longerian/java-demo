package com.tutorialspoint;

import org.springframework.context.ApplicationListener;

/**
 * Created by huifeng.hxl on 2015/3/6.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
