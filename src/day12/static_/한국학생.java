package day12.static_;

public class 한국학생 {

    String 전공; // 전공은 다를수 있다.

    static String 국적; // 한국 학생의 국적은 한국 _ 국적이 다를 수없다.

    void 전공을_물어보다(){
        System.out.println(국적);
        System.out.println(전공);
    } // 한국학생 전공이 뭐에요? 하면 어느 학생한테 물어보는지..

    static void 국적을_물어보다(){
        System.out.println(국적);
//        System.out.println(전공);
    } // 한국학생 국적이 뭐에요? 한국학생 모두가 같은 대답 한국을 말한다.

    public static void main(String[] args) {
        한국학생.국적을_물어보다();

        한국학생 김철수 = new 한국학생();
        김철수.전공을_물어보다();
    }

}
