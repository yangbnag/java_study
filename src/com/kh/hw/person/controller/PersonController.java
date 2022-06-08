package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
    private Student[] s = new Student[3];
    private Employee[] e = new Employee[10];


    public int[] personCount(){
        int studentCount = 0;
        int employeeCount = 0;
        int[] temp = new int[2];

        for (Student student : s) {
            if(student == null) break;
            studentCount++;
        }
        for (Employee employee : e) {
            if (employee == null) break;
            employeeCount++;
        }
        temp[0] = studentCount;
        temp[1] = employeeCount;

        return temp;
    }

    public void insertStudent(String name,int age, double height, double weight, int grade, String major){
        int[] idx = personCount();
        int idxNum = idx[0];
        s[idxNum] = new Student(name,age,height,weight,grade,major);

    }

    public Student[] studentPrint(){
        return s;
    }

    public void insertEmployee(String name,int age, double height, double weight, int salary, String dept){
        int[] idx = personCount();
        int idxNum = idx[1];
        s[idxNum] = new Student(name,age,height,weight,salary,dept);

    }

    public Employee[] employeePrint(){
        return e;
    }

}
