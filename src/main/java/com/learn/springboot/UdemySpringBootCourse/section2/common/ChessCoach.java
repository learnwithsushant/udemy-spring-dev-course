package com.learn.springboot.UdemySpringBootCourse.section2.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements  Coach {

    public ChessCoach() {
        System.out.println("In Constructor: -"+getClass().getSimpleName());
    }

    @PostConstruct
    public void initCoach(){
        System.out.println("Inside initCoach: "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void neutralizeCoach(){
        System.out.println("Inside neutralizeCoach: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice daily for 1 hour with problem statements";
    }
}
