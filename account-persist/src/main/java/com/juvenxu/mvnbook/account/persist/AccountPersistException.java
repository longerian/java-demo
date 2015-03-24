package com.juvenxu.mvnbook.account.persist;

/**
 * Created by huifeng.hxl on 2014/8/20.
 */
public class AccountPersistException extends Exception {

    private static final long serialVersionUID = -8334988626147289624L;

    public AccountPersistException( String message )
    {
        super( message );
    }

    public AccountPersistException( String message, Throwable throwable )
    {
        super( message, throwable );
    }

}
