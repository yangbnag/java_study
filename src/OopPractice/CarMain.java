package OopPractice;

public class CarMain {
    public static void main(String[] args) {
        car newcar = new car();

        newcar.model = "펠리세이드";
        newcar.engine = "EV10";

        newcar.showStatus();

        newcar.engineOn();

        newcar.showStatus();
    }
}
