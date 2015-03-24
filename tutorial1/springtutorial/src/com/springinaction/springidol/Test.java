package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Performer performer = (Performer) applicationContext.getBean("eddie");
        performer.perform();

        performer = (Performer) applicationContext.getBean("duke");
        performer.perform();

        performer = (Performer) applicationContext.getBean("duke15");
        performer.perform();

        Thinker volunteer = (Thinker) applicationContext.getBean("volunteer");
        volunteer.thinkOfSomething("it is not secret");

    }
}
