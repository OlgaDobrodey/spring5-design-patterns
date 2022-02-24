package com.itrex.springbootaop.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspectAfter {

    @After("execution(* com.itrex.springbootaop.service.*.*(..)) ")
    public void logAfterMethodCall(JoinPoint joinPoint) {
        String targetClass = joinPoint.getTarget().getClass().getSimpleName();
        String targetMethod = joinPoint.getSignature().getName();
        String arg = joinPoint.getArgs()[0].toString();

        log.info("5 - After Executing {}.{} with argument: {}",
                targetClass, targetMethod, arg);
    }
}
