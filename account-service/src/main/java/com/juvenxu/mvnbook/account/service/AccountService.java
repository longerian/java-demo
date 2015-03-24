package com.juvenxu.mvnbook.account.service;

/**
 * Created by huifeng.hxl on 2014/8/21.
 */
public interface AccountService {

    String generateCaptchaKey() throws AccountServiceException;

    byte[] generateCaptchaImage(String captchaKey) throws AccountServiceException;

    void signUp(SignUpRequest signUpRequest) throws AccountServiceException;

    void activate(String activationNumber) throws AccountServiceException;

    void login(String id, String password) throws AccountServiceException;

}
