package com.tutorialspoint;

import org.aspectj.lang.annotation.*;

/**
 * Created by huifeng.hxl on 2015/3/7.
 */
@Aspect
public class AnnotationBasedLogging {

    @Pointcut("execution(* com.tutorialspoint.Student.*(..))")
    private void selectAll() {};

    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("@Aspect Going to setup student profile.");
    }

    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("@Aspect Student profile has been setup.");
    }

    @AfterReturning(pointcut = "selectAll()", returning="retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("@Aspect Returning:" + retVal.toString() );
    }

    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("@Aspect There has been an exception: " + ex.toString());
    }

}
