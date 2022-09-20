package com.bjpowernode.test;

import com.bjpowernode.pojo2.School;
import com.bjpowernode.pojo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    @Test
    public void testSchool(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        School school= (School) ac.getBean("school");
        System.out.println(school);
    }

    @Test
    public void testStudent(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        Student student= (Student) ac.getBean("student");
        System.out.println(student);
    }
}
