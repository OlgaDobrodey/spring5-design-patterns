package com.itrex.springbootaop.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspectBefore {

    @Before("execution(* com.itrex.springbootaop.service.BookService.*(..))")
    public void logBeforeMethodCall() {
        log.info("1 - Inside Before Advice");
    }

    @Before("execution(* com.itrex.springbootaop.service.BookService.findNameById(..))")
    public void logBeforeMethodCall(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        String argumentName = joinPoint.getArgs()[0].toString();

        log.info("2 - Executing {} with argument: {}",
                className + methodName, argumentName);
    }
}
