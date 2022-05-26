package day07;
// 핸드폰 설계도
// 설계도로 쓸 클래스는 main을 만들지 않습니다.

// 설계도로 만들어진 핸드폰으로 전화를 걸어야지 핸드폰 도면으로
// 전화를 걸수 없기 때문에 main을 만들지 않는다고 이해 하자
public class Phone {

    //속성 : 객체의 데이터(field)

    //고유 속성 : *잘 바뀌지 않는 애들*
    //ex) 겔럭시 공장에서 아이폰이 나오지 않는다.
    String model ; //모델명
    // String도 원래 객체 타입인데 자주 쓰이기 때문에 문법을 생략하고 사용 할수 있게 java에서 허용.
    String color; // 색상
    int price; // 가격

    // 상태 속성 : *자주 변하는 것들*
    int messageCount; // 받은 문자메시지 수
    boolean on; // 전원이 커진 여부

    // 부품 속성 - 핸드폰 객체 안에 부품 속성(객체 안에 객체)
    // 문자메시지함
    String[] receiveMessages = new String[3];

    // 생성자 (constructor) : 객체의 초기화를 담당하며, 객체 생성시 반드시 호출
    // 하나도 선언하지 않을 시 자동으로 기본 생성자가 만들어진다.
    //PhoneFactory 클래스에서 Phone(); 은 Phone 클래스에서 기본으로 만들어 졌었다.
     Phone() {
    // 생성자 함수는 리턴 타입이 void 로 고정 되어 있어서 쓰지 않는다.
         // 매개변수가 없는 생성자 : 기본 생성자
         System.out.println("1번 생성자 호출!");
         model = "애니콜";
         color = "그레이";
         price = 120000;
         powerOn();
         Math.random();
         //만들자 마자 바로 사용 할수 있도록 설계도 단계에서 기본 세팅할수 있다.
    }

    // 생성자 오버로딩 : 생성자를 중복 선언
    Phone(String pModel) {
        System.out.println("2번 생성자 호출!");
        //2번 생상자는 원하는 모델을 입력 받으면 그 모델을 생성함.
        // 단 색깔과 가격은 고정.
        model = pModel;
        color = "사파이어";
        price = 500000;
        powerOn();
         // Phone() 둘다 에러 발생
        // 오버로딩 할때는 매개변수가 달라야 함.
    }
    // 모델도 만들고, 색깔도 바꾸는 기술자 3번 생성자 생성
    Phone(String pModel, String pColor) {
        System.out.println("3번 생성자 호출!");
        model = pModel;
        color = pColor;
        price = 800000;
        powerOn();
    }

    // 모델도 만들고, 색깔도 바꾸고, 가격도 책정하는 기술자 4번 생성자 생성
    Phone(String pModel, String pColor, int pPrice) {
        System.out.println("4번 생성자 호출!");
        model = pModel;
        color = pColor;
        price = pPrice;
        powerOn();
    }

    //==========================================//

    // 기능: 객체의 행위, 동작(method)
    // 설계도의 메서드는 static 을 붙이지 말 것!

    // 전원을 켜는 기능
    void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    // 전원을 끄는 기능
    void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다다.");
    }

    // 핸드폰 정보를 알려주는 기능
    void showSpec() {
        if(!on) {
            System.out.println(model + "의 전원을 켜세요");
            return;
        }
        System.out.println("\n# 휴대폰 정보");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price);
    }

    // 간단하게 핸드폰 설계를 맞췄다.
    // 하지만 Phone class 에서는 실행을 눌러도 실행되지 않는다.
    // 설계도에서는 실행을 시킬수 없다.

    // 설계용 클래스와 실행용 클래스로 나눈후 (es 삼성 개발부와 생산공장)
    // 실행용 클래스에서 설계용 클래스를 실행 시킨다.

    // 메시지를 보내는 기능
    // 아이폰.메시지를 보낸다(갤럭시, 메시지내용); // 아이폰이 갤럭시에게 메시지를 보낸다.
    // 고양이.먹는다(참치); //고양이가 참치캔을 먹는다.
    // 주어-동사-(목적어)
    // 메시지를 보내는 기능
    // 아이폰.메시지를보낸다(갤럭시, 메시지내용);
    // 고양이.먹는다(참치캔);
    void sendMessage(Phone targetPhone, String msg) {
        // 상대방의 메시지함이 가득차있는가?
        if (targetPhone.receiveMessages.length > targetPhone.messageCount) {
            // 상대방 메시지함에 메시지 넣기
            targetPhone.receiveMessages[targetPhone.messageCount++] = msg + "by " + model;
        } else { // 가득 찬 경우
            System.out.println(targetPhone.model + "의 메시지함이 가득찼습니다.");
        }
    }
//    void sendMessage(Phone targetPhone, String msg) {
//         // 상대방의 메시지함이 가득차있는가? 먼저 확인
//        if(targetPhone.receiveMessages.length>messageCount) {
//            // 메시지 함이 가득차 있지 않다면
//            // 상대만 메시지함에 메시지 넣기
//            // 메시지 함은 스트링 배열이므로 배열에 인덱스를 넣는 문법으로 접근
//            targetPhone.receiveMessages[targetPhone.messageCount++] = msg + "by "+model;
//            // 상대방의 메시지 카운터 +1이 빈 인덱스가 된다.
//                    }
//        } else {// 메시지가 가득 찬 경우
//            System.out.println(model + "의 메시지함이 가득찼습니다.");}

            // 수신메시지를 확인하는 기능
// 수신메시지를 확인하는 기능
        void checkMessages() {
            System.out.printf("\n========= [%s]의 메시지함 ==========\n", model);
            for (int i = 0; i < messageCount; i++) {
                System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
            }
        }

//        void checkMessages() {
//            System.out.printf("\n================[%s]의 메시지함===============\n",model);
//            for (int i = 0; i < messageCount; i++) {
//                System.out.printf("# %d. %s\n",i+1, receiveMessages[i]);
            }



