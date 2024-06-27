package com.devsunnysingh.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {


//This is an example of method injection.
    private MyFirstClass myFirstClass;
//    @Autowired
//    public void injectDependancy(@Qualifier("bean2") MyFirstClass myFirstClass) {
//
//        this.myFirstClass = myFirstClass;
//    }

//    setter injection demo



    @Autowired
    public void setMyFirstClass(@Qualifier("bean2") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
//This method is sjsust making a call to the sayHello method of the MyFirstClass.
        return "The dependancy is saying : "+myFirstClass.sayHello();
    }

}
