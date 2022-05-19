package day02;

public class ConditionalOperator {
    public static void main(String[] args) {
        int x = -3;
        int abs = (x >= 0) ? x : -x;
        //        1항: 조건식 ? 2항 : 참 일경우 선택 되는 것 : 3항: 거짓일 경우 선택되는 것
        System.out.println("절대값: " + abs);

        // Quiz
        int money = 0;
        String food = (money >= 5000) ? "육개장" : (money == 0) ? "굶어" : "라면";
        System.out.println("food = " + food);
        
/*
        if (money >= 5000) {
            String money5000 = "육개장";
        } else if (money <= =) {
            String money3000 = "라면";
        } else {
            String money0 = "굶어";
        }
        */

    }
}
