package com.learn.springboot.UdemySpringBootCourse.section1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuccessRestApi {


    @GetMapping("/")
    public String sayHello(){

        return "I am successful coder. I am successful Developer";
    }

    @GetMapping("/exercise")
    public String exerciseAdvise(){
        return "I am a sincere yoga practitioner ";
    }

    @GetMapping("/mindfulness")
    public String mindfulAdvise(){
        return "Kam bolo, mitha bolo and Halu bolo";
    }
}
