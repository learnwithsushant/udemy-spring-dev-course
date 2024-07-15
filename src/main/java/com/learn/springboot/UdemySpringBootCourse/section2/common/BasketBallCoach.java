package com.learn.springboot.UdemySpringBootCourse.section2.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketBallCoach implements Coach{

    public BasketBallCoach() {
        System.out.println("In Constructor: -"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Workout for 15 min followed by 100 dunks";
    }
}
