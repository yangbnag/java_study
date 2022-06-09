package day12.final_;

public class Main {
    public static void main(String[] args) {

        Korean park = new Korean("박철수","991111-11223344", "미국");

        Korean kim = new Korean("김영희","880202-2233441", "한국");
        Korean kim2 = new Korean("홍길동","880202-2233441", "중국");
        Korean kim3 = new Korean("고길동","880202-2233441","러시아");

        park.name = "박찬호";
        // 주민번호는 처음에 결정되면 절대 못바꾸게 하고 싶다.! 생성자 클래스에 id 필드 private
//        kim.id = "880202-29999911";

//        kim.nation = "중국"; // fianl에 의한 불변성으로 변경 불가능


       System.out.println(park);
        System.out.println(kim);
        System.out.println(kim2);
        System.out.println(kim3);

        // 유일성을 만족한 듯 하지만..

    }



}
