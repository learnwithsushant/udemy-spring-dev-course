package com.learn.springboot.UdemySpringBootCourse.section2.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class YogaCoach implements Coach{

    public YogaCoach() {
        System.out.println("In Constructor: -"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice Daily 21 SuryaNamaskar";
    }
}
