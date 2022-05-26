package day07;

public class PhoneMain {
    public static void main(String[] args) {
        // 핸드폰을 새로운 클래스에서 만들거다.

        Phone galaxy = new Phone("갤럭시S21");
        Phone iphone = new Phone("아이폰13 pro");
        Phone note = new Phone("갤노트");

        // 둘다 모델명과 가격 색깔은 같지만 다른 폰이다.

        galaxy.sendMessage(iphone,"안녕 나는 갤럭시~");
        galaxy.sendMessage(iphone,"메롱 멜롱~~!");
        note.sendMessage(iphone, "나는 갤럭시 노트야~~ 하위~");
        note.sendMessage(iphone, "나는 갤럭시 노트야~~ 하위~");

//        iphone.sendMessage(note, "나는 애플폰이야~");
//        galaxy.sendMessage(note, "ddddd");
//
//        iphone.sendMessage(galaxy, "ggpgpgpgp");
//
//        iphone.sendMessage(note, "ddddd");
//        iphone.sendMessage(note, "ddddd");


        iphone.checkMessages();



        // 각 핸드폰들의 필드가 저장되어 있는 Heap 의 주소 확인
//        System.out.printf("p1의 주소 : %s\n", p1 );
//        System.out.printf("p2의 주소 : %s\n", p2 );

    }
}
