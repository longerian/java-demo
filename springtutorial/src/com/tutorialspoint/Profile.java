package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by huifeng.hxl on 2015/3/5.
 */
public class Profile {

    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile() {
        System.out.println("inside profile constructor");
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge());
    }

    public void printName() {
        System.out.println("Name : " + student.getName());
    }

}
