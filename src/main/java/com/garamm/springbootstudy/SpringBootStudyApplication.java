package com.garamm.springbootstudy;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStudyApplication {

    public static void main(String[] args) throws LifecycleException {
        SpringApplication.run(SpringBootStudyApplication.class, args);
    }

}
