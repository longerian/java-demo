package com.springinaction.springidol;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
public class Volunteer implements Thinker {

    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }

}
