package com.juvenxu.mvnbook.account.captcha;

import java.util.List;

/**
 * Created by huifeng.hxl on 2014/8/21.
 */
public interface AccountCaptchaService {

    String generateCaptchaKey() throws AccountCaptchaException;

    byte[] generateCaptchaImage(String captchaKey) throws AccountCaptchaException;

    boolean validateCaptcha(String captchaKey, String captchaValue) throws AccountCaptchaException;

    List<String> getPreDefinedTexts();

    void setPreDefinedTexts(List<String> preDefinedTexts);
}
