import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class BuddyInfoAspectPointcut {
    @Before("getNamePointcut()")
    public void secondAdviceName(){
        System.out.println("Executing secondAdvice on getName()");
    }

    @Before("getAddressPointcut()")
    public void secondAdviceAddress(){
        System.out.println("Executing secondAdvice on getAddress()");
    }

    @Before("getPhone_numPointcut()")
    public void secondAdvicePhone_num(){
        System.out.println("Executing secondAdvice on getPhone_num()");
    }

    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}

    @Pointcut("execution(public String getAddress())")
    public void getAddressPointcut(){}

    @Pointcut("execution(public String getPhone_num())")
    public void getPhone_numPointcut(){}

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice(){
        System.out.println("Before executing service method");
    }

    /**
    @Pointcut("within()")
    public void allMethodsPointcut(){}
    */
}
