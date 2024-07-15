package com.learn.springboot.UdemySpringBootCourse.section2.rest;

import com.learn.springboot.UdemySpringBootCourse.section2.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach,theSecondCoach;


    @Autowired
    public DemoController(
            @Qualifier("yogaCoach") Coach theCoach,
            @Qualifier("aquaticCoach") Coach theSecondCoach){
        this.myCoach=theCoach;
        this.theSecondCoach=theSecondCoach;
    }

    @GetMapping("/dailyWorkout")
    public  String getDailyWorkout(){
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/secondCoachdailyWorkout")
    public  String get2DailyWorkout(){
        return theSecondCoach.getDailyWorkOut();
    }

    @GetMapping("/checkSingleTonScope")
    public String getForSingleInstance(){

        return "Check whether theCoach and theSecondCoach are same - "+ (myCoach == theSecondCoach);
    }
}
