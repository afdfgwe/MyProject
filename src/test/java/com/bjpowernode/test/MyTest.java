package com.bjpowernode.test;

import com.bjpowernode.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testStudent(){
        //程序员创建
        Student student=new Student();
        System.out.println(student);
    }

    @Test
    public void testStudentSpring(){
        //创建容器对象并启动
        ApplicationContext ac=new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student student= (Student) ac.getBean("stu");
        System.out.println(student);
    }

}
