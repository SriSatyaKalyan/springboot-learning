package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // - this annotation is intended to make it the primary class
@Lazy // - this is to ensure it is not initialized without necessity
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
