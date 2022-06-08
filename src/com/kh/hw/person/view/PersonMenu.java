package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

import java.util.Arrays;
import java.util.Scanner;

public class PersonMenu {
    Scanner sc;
    PersonController pc;

   public PersonMenu() {
        sc = new Scanner(System.in);
        pc = new PersonController();
    }

    public void mainMenu() {
        while (true) {
            int[] idx = pc.personCount();
            int idxStudentNum = idx[0];
            int idxEmployeeNum = idx[1];
            System.out.println
                    ("학생은 최대 3명까지 저장할 수 있습니다.\n" +
                            "현재 저장된 학생은" + idxStudentNum + "명입니다.\n" +
                            "사원은 최대 10명까지 저장할 수 있습니다.\n" +
                            "현재 저장된 사원은" + idxEmployeeNum + "명입니다.");

            System.out.println(
                    "1. 학생 메뉴 ➔ studentMenu()\n" +
                            "2. 사원 메뉴 ➔ employeeMenu()\n" +
                            "9. 끝내기 ➔ “종료합니다.” 출력 후 종료\n" +
                            "메뉴 번호 :"
                          );

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    studentMenu();
                    break;

                case 2:
                    employeeMenu();
                    break;

                case 9:
                default:
                    System.out.println("종료합니다.");
                    return;
            }
        }
    }



    public void studentMenu() {
        while (true) {
            System.out.println("1.학생추가\n 2.학생보기\n 9.메인으로");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    insertStudent();
                    break;

                case 2:
                    printStudent();
                    break;
                case 9:
                default:
                    return;
            }
        }
    }

    public void insertStudent() {
        System.out.println("====학생 추가 메뉴===");
        int[] idx = pc.personCount();
        int idxStudentNum = idx[0];
        int idxEmployeeNum = idx[1];

        while (true) {
            if (idxStudentNum == 3) {
                System.out.println(
                        "학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.”");
                break;

            } else {
                String name = sc.next();
                int age = sc.nextInt();
                double height = sc.nextDouble();
                double weight = sc.nextDouble();
                int grade = sc.nextInt();
                String major = sc.next();

                pc.insertStudent(name, age, height, weight, grade, major);
                break;
            }
        }
    }

    public void printStudent(){
        for (Student student : pc.studentPrint()) {
            if(student == null) break;
            System.out.printf("%s, %d, %1f, %1f, %d, %s",student.getName(),student.getAge(),student.getHeight(),student.getWeight(),student.getGrade(),student.getMajor());

        }

    }

    public void employeeMenu(){

    }

}
