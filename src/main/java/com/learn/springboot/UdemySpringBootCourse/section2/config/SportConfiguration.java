package com.learn.springboot.UdemySpringBootCourse.section2.config;

import com.learn.springboot.UdemySpringBootCourse.section2.common.Coach;
import com.learn.springboot.UdemySpringBootCourse.section2.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfiguration {
 @Bean("aquaticCoach")
 public Coach swimCoach(){
     return new SwimCoach();
 }


}
