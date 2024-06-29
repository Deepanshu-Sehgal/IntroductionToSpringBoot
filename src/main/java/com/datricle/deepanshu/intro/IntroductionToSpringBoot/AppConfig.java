package com.datricle.deepanshu.intro.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Apple getApple(){
        return new Apple();
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeAppleIsDestroy(){
        System.out.println("Destroying the apple before use");
    }

}