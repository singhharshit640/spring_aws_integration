package com.studies.springaws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Spring AWS Controller")
public class SpringAWSController {

    /*
     * To access swagger use "localhost:8080/swagger-ui/index.html"
     */
    @Operation(summary= "Ping Backend", description= "API to ping the backend to check whether backend is up and working fine.")
    @GetMapping("/aws/ping")
    public String ping(){
        return "Everthing's working fine bro! Chillax! 🍻";
    }

    /*
     * To access swagger use "localhost:8080/swagger-ui/index.html"
     */
    @Operation(summary= "Default endpoint", description= "API to ping the backend to check whether backend is up and working fine.")
    @GetMapping("/")
    public String helloHarshit(){
        return "Hi Harshit! Your demo application is running just fine! Also you just deployed your first backend to AWS cloud! Yay 🎉";
    }
    
}
