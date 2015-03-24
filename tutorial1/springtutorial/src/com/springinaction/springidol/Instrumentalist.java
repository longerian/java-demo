package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
@Component("eddie")
public class Instrumentalist implements Performer {

    @Autowired
    @Qualifier("piano")
    private Instrument instrument;

    public Instrumentalist() {}

    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }


    @Override
    public void perform() {
        this.instrument.play();
    }
}
