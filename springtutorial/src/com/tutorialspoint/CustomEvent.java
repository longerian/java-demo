package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

/**
 * Created by huifeng.hxl on 2015/3/6.
 */
public class CustomEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "My custom event";
    }
}
