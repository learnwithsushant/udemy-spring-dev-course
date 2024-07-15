package com.learn.springboot.UdemySpringBootCourse.section2.common;
// This class is purposefully not marked as component just to deonstrate configuration concept
public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("Inside the SwimConstructor - "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Hand workout and Freestyle Swim for 25mins";
    }
}
