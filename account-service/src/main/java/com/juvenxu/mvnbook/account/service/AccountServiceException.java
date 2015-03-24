package com.juvenxu.mvnbook.account.service;

/**
 * Created by huifeng.hxl on 2014/8/21.
 */
public class AccountServiceException extends Exception {

    private static final long serialVersionUID = -5132506336189966641L;

    public AccountServiceException( String message )
    {
        super( message );
    }

    public AccountServiceException( String message, Throwable throwable )
    {
        super( message, throwable );
    }

}
