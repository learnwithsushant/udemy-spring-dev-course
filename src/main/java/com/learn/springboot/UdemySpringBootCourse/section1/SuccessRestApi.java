package com.learn.springboot.UdemySpringBootCourse.section1;

import com.learn.springboot.UdemySpringBootCourse.common.response.ResponseHandler;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static io.restassured.RestAssured.given;

@RestController
@Tag(name = "Learning Springboot API", description = "Sample code ")
public class SuccessRestApi {


    @GetMapping("/")
    @Operation(summary = "Success operation")
    public String sayHello(){

        return "I am successful coder. I am successful Developer in 2024";
    }

    @GetMapping("/exercise")
    @Operation(summary = "Exercise api")
    public String exerciseAdvise(){
        return "I am a sincere yoga practitioner ";
    }

    @GetMapping("/mindfulness")
    @Operation(summary = "Mindful Endpoint")
    public String mindfulAdvise(){
        return "Kam bolo, mitha bolo and Halu bolo";
    }

    @GetMapping("/fetchUser")
    @Operation(summary = "fetchUser")
    public ResponseEntity<Object> fetchUser(@RequestParam String page){

        Response response = given()
                .contentType(ContentType.JSON)
                .param("page", page)
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .extract().response();



        return ResponseHandler.responseBuilder("Data Received", HttpStatus.OK,response.asPrettyString());
    }

}
