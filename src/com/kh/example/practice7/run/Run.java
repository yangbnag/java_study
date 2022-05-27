package com.kh.example.practice7.run;
import com.kh.example.practice7.model.vo.Employee;

public class Run {
    public static void main(String[] args) {
      Employee n1 = new Employee();
      Employee n2 = new Employee(101,"박철수");
      Employee n3 = new Employee(103,"김영희","영업부","대리",22,'여',2300000,0.1,"010-4444-4444","경기도 수원시 영통구 매탄동 196-94");


      n3.info();

    }
}
