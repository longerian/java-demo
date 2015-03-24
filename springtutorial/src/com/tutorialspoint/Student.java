package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by huifeng.hxl on 2015/3/5.
 */
public class Student {

    private Integer id;
    private Integer age;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    @Autowired(required=false)
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
