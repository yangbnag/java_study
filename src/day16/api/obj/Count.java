package day16.api.obj;

public class Count {

    int n;

    // 생성자
    public Count(int n) {
        System.out.println(n + "번 객체 생성됨!");
        this.n = n;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(n+"번 객체 소멸!"); // java9 버전부터는 지양
    }
}
