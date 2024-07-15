package com.learn.springboot.UdemySpringBootCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class UdemySpringBootCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemySpringBootCourseApplication.class, args);
	}

}
