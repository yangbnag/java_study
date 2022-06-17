package day18.anonymoue;

public class CarMain {
    public static void main(String[] args) {

/*
        Car avante = new Car() {
            @Override
            public void run() {
                System.out.println("아반떼가 달립니다.");
            }
        };
*/
        Car avante = () -> System.out.println("아반떼가 달립니다.");


        avante.run();
    }
}
