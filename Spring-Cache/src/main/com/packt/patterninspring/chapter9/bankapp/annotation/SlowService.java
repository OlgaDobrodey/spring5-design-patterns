package main.com.packt.patterninspring.chapter9.bankapp.annotation;

import org.springframework.cache.annotation.Cacheable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(ElementType.METHOD)
@Cacheable(value = "accountCache", key = "#id")
public @interface SlowService {

}
