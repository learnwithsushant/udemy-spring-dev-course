package com.learn.springboot.UdemySpringBootCourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class UdemySpringBootCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemySpringBootCourseApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String args[]){
		return runner -> {
			System.out.println("I am a skilled Developer !");
		};
	}

}
