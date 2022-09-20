package com.bjpowernode.pojo2;

public class Student {
    private String name;
    private int age;
    //引用类型
    private School school;

    public Student() {
        System.out.println("---学生的构造方法---");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
