package com.group5.AOPDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BuddyAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on com.group5.AOPDemo.BuddyInfo getName()");
    }

    @Before("execution(public String getAddress())")
    public void getAddressAdvice(){
        System.out.println("Executing Advice on com.group5.AOPDemo.BuddyInfo getAddress()");
    }

    @Before("execution(public String getPhone_num())")
    public void getNumAdvice(){
        System.out.println("Executing Advice on com.group5.AOPDemo.BuddyInfo getPhone_num()");
    }

    /**
    @Before("execution()")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }
    */
}
