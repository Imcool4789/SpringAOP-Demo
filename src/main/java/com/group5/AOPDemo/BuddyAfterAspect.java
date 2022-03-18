package com.group5.AOPDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BuddyAfterAspect
{
    @After("args(name)")
    public void logStringArguments(String name){
        System.out.println("Running After Advice. String argument passed="+name);
    }

    @AfterThrowing("within(com.group5.AOPDemo.BuddyInfo)")
    public void logExceptions(JoinPoint joinPoint){
        System.out.println("Exception thrown in com.group5.AOPDemo.BuddyInfo Method="+joinPoint.toString());
    }

    @AfterReturning(pointcut="execution(* getName())", returning="returnString")
    public void getNameReturningAdvice(String returnString){
        System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
    }

    @AfterReturning(pointcut="execution(* getAddress())", returning="returnString")
    public void getAddressReturningAdvice(String returnString){
        System.out.println("getAddressReturningAdvice executed. Returned String="+returnString);
    }

    @AfterReturning(pointcut="execution(* getPhone_num())", returning="returnString")
    public void getPhone_numReturningAdvice(String returnString){
        System.out.println("getPhone_numReturningAdvice executed. Returned String="+returnString);
    }

}
