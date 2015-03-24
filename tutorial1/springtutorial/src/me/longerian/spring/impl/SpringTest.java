package me.longerian.spring.impl;

import com.springinaction.springidol.Performer;
import me.longerian.spring.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huifeng.hxl on 2014/7/24.
 */
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Hello sayHello = (Hello) applicationContext.getBean("sayhello");
        sayHello.sayHello();

        Performer performer = (Performer) applicationContext.getBean("eddie");
        performer.perform();
    }
}
