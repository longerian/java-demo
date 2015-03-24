package com.tutorialspoint;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by huifeng.hxl on 2015/3/1.
 */
public class MainApp {

    static Logger log = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();

        context.registerShutdownHook();

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        Student student = (Student) context.getBean("student");
        student.getAge();
        student.getName();

        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        ctx.registerShutdownHook();
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage1("hahahahah");
        helloWorld.getMessage1();

        context.start();
        context.stop();

        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
        customEventPublisher.publish();
        customEventPublisher.publish();

//        student.printThrowException();

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----" );
        student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());

        StudentJDBCTemplate2 studentJDBCTemplate2 = (StudentJDBCTemplate2) context.getBean("studentJDBCTemplate2");
        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------" );
        students = studentJDBCTemplate2.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Listing Record with ID = 5 -----" );
        //procedure 有点问题，未解决
//        student = studentJDBCTemplate2.getStudent(5);
//        System.out.print("ID : " + student.getId() );
//        System.out.print(", Name : " + student.getName() );
//        System.out.println(", Age : " + student.getAge());

        log.info("Going to test log4j");
        log.debug("debugggggg");
        log.error("errorrrrrr");
        log.info("Exiting the program");
    }

}
