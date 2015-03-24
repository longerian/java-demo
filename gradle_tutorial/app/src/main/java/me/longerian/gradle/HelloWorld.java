package me.longerian.gradle;

import org.apache.log4j.Logger;

/**
 * Created by huifeng.hxl on 2015/3/13.
 */
public class HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");

        MessageService messageService = new MessageService();

        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }

}
