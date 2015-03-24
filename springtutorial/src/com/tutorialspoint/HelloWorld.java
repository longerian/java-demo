package com.tutorialspoint;

/**
 * Created by huifeng.hxl on 2015/3/1.
 */
public class HelloWorld {

    private String message1;
    private String message2;

    public String getMessage1() {
        System.out.println("Your message1 " + message1);
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        System.out.println("Your message2 " + message2);
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now");
    }

}
