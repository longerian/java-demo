package com.tutorialspoint;

/**
 * Created by huifeng.hxl on 2015/3/8.
 */
public class SpringException extends RuntimeException {

    private String exceptionMsg;

    public SpringException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg(){
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

}
