package day07;

// 실행용 클래스
// main 메서드를 생성
public class PhoneFactory {
    public static void main(String[] args) {

        //폰 객체 생성
       // ↓ Phone이라는 참조타입을 생성
       Phone galaxy = new Phone(); // 핸드폰 객체, 인스턴스를 생성함.
        //설계도 클래스에서 1번 생성자 호출 함수를 만든후 다시 실행했을 때

        // 객체의 속성과 기능을 참조( . 연산자)
//        galaxy.model = "갤럭시 s21";
//        galaxy.color = "펄 블루";
//        galaxy.price = 1000000;
        // galaxy는 변수, model color price는 필드 이다.

        galaxy.model ="갤럭시"; // 기본 셋팅된 애니콜이 마음에 안든다는 생산 의뢰자
        // 스티커만 갤럭시로 바꾸는것도 이상한거 같은데..
        // 기술자인 Phone(); 에게 회사 책임자가 애니콜밖에 못만드냐고 혼냈을때 기술자는 애니콜 밖에 못 만든다고 이야기 함.
        // Phone();는 기본 생성자 이다.

        galaxy.showSpec();
        System.out.println("==================");
        //손님이 새로운 iPhoneX을 만들어 달라고 함.
        Phone iPhoneX = new Phone("아이폰X");
        // 만들고 출력
        // 2번 생성자가 호출되지 않았다. 1번 생성자가 또 호출됨.
        // 생성자 괄호 안에 모델명을 입력해줘야함.
        iPhoneX.showSpec();
        // 아 2번 기본생성자에 전원 안켜놨따..
        // 아이폰 만들었따!

        // 핸드폰 만들면서 색깔을 바꿀수 있는 기술자자가 필요해졌다

        System.out.println("=============================");
        Phone gNote = new Phone("갤럭시 노트","제니레드");
        gNote.showSpec();
        // 1번 생성자가 호출됐어.ㅠ
        // Phone(); 괄호 안에 모델명과 색깔을 넣어줘야 3번 생성자가 호출된다.

        System.out.println("============================");
        // 연습- 어떤 사람이 샤오미를 만들어 달라고 했다.
        // 요구 사항 : 샤오미 3.0 모델 색깔은 화이트 가격은 20만원

        Phone xhoami = new Phone("쌰오미3.0","화이트",200000);
        // 이걸 할 수있는 기술자(생성자)를 만들어라
        xhoami.showSpec();

        // 생성자를 여러개 만드는 이유는 고객의 다양한 요구사항을 수월하게 처리하기 위해서서
/*
// 계도만 있으면 핸드폰이 만들어지는게 아니다. 기술자가 필요!
        Phone galaxy = new Phone(); // ← Phone(); 는 생성자 함수 = 기술자이다.
        //Phone(); 함수 처럼 생긴 이 아이는 어디서 온걸깔?


 */

        // 변수에 담아야 함
        // 변수에 데이터 타입이 필요한데..
        // int 2개 boolean 1개 String 3개 의 타입이 있는 Phone
        // 커스텀 타입을 만든다.
        // Phone라는 타입은 int 2개 boolean 1개 String 3개가 있는 타입 이다.

        // 타입은 기본 타입과 참조 타입이 있다.
        // 기본 타입은 미리 준비되어 있는 그릇
        // 참조 타입은 해당 데이터에 맞게 제작한 타입
    }
}
