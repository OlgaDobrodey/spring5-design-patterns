package com.itrex.springbootaop.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspectAfterThrowing {

    @AfterThrowing(value = "execution(* com.itrex.springbootaop.service.BookService.*(..))",
            throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Exception ex) {

        log.error("4 - Target Method resulted into exception, message {}", ex.getMessage());
    }
}
