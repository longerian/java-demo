package com.springinaction.springidol;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
public class Magician implements MindReader {

    private String thoughts;

    @Override
    public String getThoughts() {
        return thoughts;
    }

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }
}
