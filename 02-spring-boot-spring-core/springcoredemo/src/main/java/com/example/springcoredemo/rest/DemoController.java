package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for dependency
    private Coach myCoach;

    //define a constructor for dependency injection

//  --- CONSTRUCTOR INJECTION ---
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){
        myCoach = theCoach;
    }
//  --- end of constructor injection ---

//   --- SETTER INJECTION ---
//    @Autowired
//    public void doSomeStuff(Coach theCoach){
//        myCoach = theCoach;
//    }
//   --- end of setter injection ---

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
