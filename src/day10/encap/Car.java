package day10.encap;

public class Car {
    private String model; // 모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드 (D, N, R, P)
    private boolean start; // 시온 온오프 상태

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

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
