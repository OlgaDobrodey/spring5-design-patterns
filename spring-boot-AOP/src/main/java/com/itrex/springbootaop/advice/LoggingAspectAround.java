package com.itrex.springbootaop.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Aspect
@Component
public class LoggingAspectAround {

    @Around("execution(* com.itrex.springbootaop.service.*.*(..)) ")
    public Object logBeforeAndAfterMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        String targetClass = joinPoint.getTarget().getClass().getSimpleName();
        String targetMethod = joinPoint.getSignature().getName();
        String arg = joinPoint.getArgs()[0].toString();

        log.info("6.1 - Executing {}.{} with argument: {}", targetClass, targetMethod, arg);

        Object response = joinPoint.proceed();

        log.info("6.2 - Method returned: {}", response);

        return response;
    }
}
