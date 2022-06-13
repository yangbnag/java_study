package day14.abs.pet;

// 애완동물의 공통 클래스 (실체가 없는 추상적 개념)
public abstract class Pet { // abstract 클래스와 메서드에 붙여 static 처럼 사용.
    //필드
    private String name; // 이름
    private String kind; // 종
    private int age; // 나이

    //생성자
    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //메서드
    // 먹이를 먹는 기능
    public abstract void feed(); // 추상메서드라고 부른다.
        // 부모의 클래스이면서 추상 클래스인 Pet에서는 구체적인 기능은 필요가 없다.

    // 낮잠을 자는 기능
    public abstract void takeNap();

    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
