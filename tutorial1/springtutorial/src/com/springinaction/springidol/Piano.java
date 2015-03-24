package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Don don don");
    }
}
