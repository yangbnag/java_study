#### 다음 코드 실행 결과는 4, 5, 6, 42 중 무엇?

```java
public class MeaningOfThis {

    public final int value = 4; // MeaningOfThis 의 필드

    public void doIt() {
        int value = 6; // 로컬 변수
        Runnable r = new Runnable() {
            public final int value = 5; // Runnable 익명 클래스의 필드
            @Override
            public void run() {
                int value = 42; // 로컬변수
                System.out.println(this.value);
            }
        };
    }
    
    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}

```


---
정답: 5