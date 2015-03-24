package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Strum strum strum");
    }
}
