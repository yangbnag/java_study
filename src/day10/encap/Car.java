package day10.encap;

public class Car {
    private String model; // 모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드 (D, N, R, P)
    private boolean start; // 시온 온오프 상태

    // 필드에 private으로 설정해놓은 이유
    // ex) 자동차 주행중에 car.start = false; 필드에 접근하여 값을 변동하면
    // 위험한 상황이 발생할수 있다. 필드는 메서드를 통해 수정해야한다.

    // 생성자
    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    //메서드
    // setter : 필드값 변경을 대리하는 메서드
    public void setSpeed(int speed){ // set+필드명 이름 짓는 관례
        if(speed < 0 || speed > 200){
            return;
        }
        this.speed = speed;
    }
    // getter : 은닉된 필드값을 참조하는 메서드
    public int getSpeed(){ // get+필드명 이름 짓는 관례
        return this.speed;
    }

    // Mode의 setter -> setter는 void
    public void setMode(char mode){
        switch(mode){
            case 'D': case 'R': case 'N': case 'P':
                this.mode = mode;
                break;
            default:
                this.mode='p';
        }
    }

    //시동 거는 기능
    public void engineStart(){
        System.out.println("시동버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        moveCylinder();

        System.out.println("시동이 걸렸습니다.");
    }

    // 엔진에 연료가 주임되는 기능
    private void injectGasoline(){
        System.out.println("연료가 엔진에 주입 됩니다.");
    }

    // 엔진 오일이 주입되는 기능
    private void injectOil(){
        System.out.println("엔진 오일이 순호나합니다.");
    }

    //실린더가 움직이는 기능
    private void moveCylinder(){
        if(start){
            System.out.println("실린더가 움직입니다.");

        } else
            System.out.println("차가 고장났습니다.");
    }
// Mode의 getter
    public char getMode() {
        return mode;
    }

    // 자동완성
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //getter 와 setter 관례 중 boolean getter만 is필드명
    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    //시동을 끄는 기능
    public void engineStop(){
        if(this.speed > 0){
            System.out.println("주행중에는 시동을 끌수가 없어요");
            return;
        }
        this.start = false;
        System.out.println("시동이 꺼졌습니다.");
    }
}
