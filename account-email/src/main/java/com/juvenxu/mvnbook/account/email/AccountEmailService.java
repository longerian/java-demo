package com.juvenxu.mvnbook.account.email;

/**
 * Created by huifeng.hxl on 2014/8/19.
 */
public interface AccountEmailService {

    void sendEmail(String to, String subject, String htmlText) throws AccountEmailException;

}
