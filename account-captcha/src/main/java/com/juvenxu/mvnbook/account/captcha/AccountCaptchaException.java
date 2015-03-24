package com.juvenxu.mvnbook.account.captcha;

/**
 * Created by huifeng.hxl on 2014/8/21.
 */
public class AccountCaptchaException extends Exception {

    private static final long serialVersionUID = 8526113849407273452L;

    public AccountCaptchaException( String message )
    {
        super( message );
    }

    public AccountCaptchaException( String message, Throwable throwable )
    {
        super( message, throwable );
    }
}
