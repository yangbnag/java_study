package day18.anonymoue;

public class Main {
    // 내부 클래스 -> 클래스 안에 이너 클래스 만들기!
    public static class SubOperator implements Calculator {
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        // 더하기 완료!
        Calculator addCal = new AddOperator();
        System.out.println(addCal.operate(10, 20));

        // 내부 클래스로 뺄셈 해보자!
        SubOperator subCal = new SubOperator();
        System.out.println(subCal.operate(50, 30));

        // 익명 클래스
        Calculator multiCal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        System.out.println(multiCal.operate(5, 3)); // 익명 클래스로 곱하기 하기

        // 람다
        Calculator divCal = (n1, n2) -> n1 / n2;

        System.out.println(divCal.operate(100, 50)); // 람다로 나누기 하기

/*
        PowerfulOperator po = (f,s cal) -> cal.operate(f,s);

        System.out.println(po.powerOperate(300,500, new AddOperator()));
        System.out.println(po.powerOperate(700,200, new SubOperator()));
        System.out.println(po.powerOperate(700, 200, new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1*n2;
            }
        }));
        System.out.println(po.powerOperate(1000,200,(n1,n2)->n1/n2));
*/
/*


        Calculator addCall = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1*n2;
            }
        };*/


        Calculator addCall = (int n1, int n2) -> n1*n2;

        Car tucson = () -> System.out.println("투싼이 달립니다.");
        tucson.run();



    }
}
