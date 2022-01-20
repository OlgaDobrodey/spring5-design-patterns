package com.packt.patterninspring.chapter6.bankapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Dinesh.Rajput
 */
@Aspect
@Component
public class Auditing {

    //Before transfer service
    @Before("execution(* com.packt.patterninspring.chapter6.bankapp.service.TransferService.transfer(..))")
    public void validate() {
        System.out.println("bank validate your credentials before amount transferring");
    }

    //Before transfer service
    //execution -
    //Основной дескриптор срезов Spring AOP. Подбирает
    //точки соединения, соответствующие вызовам методов
    @Before("execution(* com.packt.patterninspring.chapter6.bankapp.service.TransferService.transfer(..))")
    public void transferInstantiate() {
        System.out.println("bank instantiate your amount transferring");
    }
//
//    //After transfer service
//    @AfterReturning("execution(* transfer(..))")
//    public void success() {
//        System.out.println("bank successfully transferred amount");
//    }
//
//    //After failed transfer service
//    @AfterThrowing("execution(* com.packt.patterninspring.chapter6.bankapp.service.TransferService.transfer(..))")
//    public void rollback() {
//        System.out.println("bank rolled back your transferred amount");
//    }
//
//    //After transfer service
//    @After("execution(* com.packt.patterninspring.chapter6.bankapp.service.TransferService.transfer(..))")
//    public Object trackTransactionAttempt(JoinPoint point) {
//        System.out.println("bank has attempted a transaction");
//        return point;
//    }

    // to stop or proceed the target method execution
    @Around("execution(* com.packt.patterninspring.chapter6.bankapp.service.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around advice");
        return point.proceed();
    }

    @Around("execution(* com.packt.patterninspring.chapter6.bankapp.service.TransferService.createCache(..))")
    public Object cache(ProceedingJoinPoint point) throws Throwable {
        System.out.println("method cache");
        long start = System.currentTimeMillis();

        Object proceed = point.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(point.getSignature().getName() + " executed in " + executionTime + "ms");

        return point;
    }
}
