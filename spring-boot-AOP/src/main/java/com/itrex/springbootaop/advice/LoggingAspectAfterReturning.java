package com.itrex.springbootaop.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Aspect
@Component
public class LoggingAspectAfterReturning {

    @AfterReturning(value = "execution(* com.itrex.springbootaop.service.BookService.*(..))",
            returning = "returned")
    public void logAfterReturning(JoinPoint joinPoint, List<String> returned) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        log.error("3 - Target method successfully completed, result: {}", className +" " + methodName+" "+returned);
    }
}

