package practice3.model.vo;

public class Dog extends Animal {

    public String PLACE = "애견카페";
    private int weight;

    public Dog() {
    }


    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.println(super.toString() + "몸무게는 " + this.getWeight() + "kg입니다.");
    }


    public String getPLACE() {
        return PLACE;
    }

    public void setPLACE(String PLACE) {
        this.PLACE = PLACE;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
