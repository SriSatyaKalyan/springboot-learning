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
    private Coach anotherCoach;

    //define a constructor for dependency injection

//  --- CONSTRUCTOR INJECTION ---
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach
//                       ,@Qualifier("cricketCoach") Coach theAnotherCoach
    ){

        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;

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

//    The below code was written to understand SCOPES
//    @GetMapping("/check")
//    public String check(){
//        return ("Comparing beans myCoach == anotherCoach, " + (myCoach == anotherCoach));
//    }

}
