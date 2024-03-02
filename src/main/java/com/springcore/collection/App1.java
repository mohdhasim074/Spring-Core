package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/collection/collectionConfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1");

        System.out.println("Name : " + emp1.getName());
        System.out.println("Phones : " + emp1.getPhones());
        System.out.println("Address : " + emp1.getAddresess());
        System.out.println("Courses : " + emp1.getCourses());

    }

}
