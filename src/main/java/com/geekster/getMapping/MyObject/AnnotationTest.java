package com.geekster.getMapping.MyObject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationTest {
    @Bean
    public Car getCarObject(){
        return new Car ("Red");
    }

}
