package com.itrex.bankapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Auditing {

    //Before transfer service
    @Before("execution(* com.itrex.bankapp.service.TransferService.transfer(..))")
    public void validate() {
        System.out.println("bank validate your credentials before amount transferring");
    }

    /*
    Before transfer service
    Основной дескриптор срезов Spring AOP. Подбирает
    точки соединения, соответствующие вызовам методов
     */
    @Before("execution(* com.itrex.bankapp.service.TransferService.transfer(..))")
    public void transferInstantiate() {
        System.out.println("1 - bank instantiate your amount transferring");
    }

    //After transfer service
    @AfterReturning("execution(* transfer(..))")
    public void success() {
        System.out.println("2 - bank successfully transferred amount\n");
    }

    //After failed transfer service
    @AfterThrowing("execution(* com.itrex.bankapp.service.TransferService.transfer(..))")
    public void rollback() {
        System.out.println("3 - bank rolled back your transferred amount");
    }

    //After transfer service
    @After("execution(* com.itrex.bankapp.service.TransferService.transfer(..))")
    public Object trackTransactionAttempt(JoinPoint point) {
        System.out.println("4 - bank has attempted a transaction");
        return point;
    }

    // to stop or proceed the target method execution
    @Around("execution(* com.itrex.bankapp.service.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("5 - around advice");
        return point.proceed();
    }

    @Around("execution(* com.itrex.bankapp.service.TransferService.createCache(..))")
    public Object cache(ProceedingJoinPoint point) throws Throwable {
        System.out.println("method cache");
        long start = System.currentTimeMillis();

        Object proceed = point.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(point.getSignature().getName() + " executed in " + executionTime + "ms");

        return point;
    }
}
