package com.packt.patterninspring.chapter5.scope.config;

import com.packt.patterninspring.chapter5.scope.scope.MyThreadScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @author Dinesh.Rajput
 */
@Configuration
@ComponentScan("com.packt.patterninspring.chapter5.scope")
public class Config {

    @Bean
    public static CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("myThreadScope",new MyThreadScope());
        customScopeConfigurer.setScopes(hashMap);

        return customScopeConfigurer;
    }


}
