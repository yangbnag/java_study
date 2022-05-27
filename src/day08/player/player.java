package day08.player;

public class player {

    //필드선언
    String Name; // 닉네임
    int Level; //
    int Hp; // 체력

    //생성자
    player() {
        this("이름없음"); // 이름으로 콜하는거는 객체 생성시에만 가능
                               //this 는 나 자신 객체 / this() = 나의 생성자 중에

        // 1. 2번 생성자 호출 후 -> 2. 2번 생성자 호출
        // this()를 쓰려면 첫번째 줄에 써야함.
        System.out.println("1번 생성자 호출!");

//        this.Name = "이름없음";
//        this.Level = 1;
//        this.Hp = 50;
    }
    player(String Name) {
        this(Name,1,50);
        System.out.println("2번 생성자 호출!");
//        this.Name = Name;
//        this.Level = 1;
//        this.Hp = 50;
    }

    player(String Name, int Level, int Hp) {
        System.out.println("3번 생성자 호출!");
        this.Name = Name; // 지역변수 이름과 필드 이름이 같을때 this로 구분 시킬수 있다.
        this.Level = Level;
        this.Hp = Hp;
    }



    void attack(player target) {
        // 매개변수1개를 넣지만 자기자신의 this가 숨어 있다.

        // 출력메시지 x가 y를 공겹합니다.
//        System.out.println("target = "+ target);
        System.out.printf("%s가 %s를 공격합니다.\n",this.Name,target.Name);

        if(this == target) {
            System.out.println("스스로는 공격할 수 없습니다.");
            return;
        }

        //상대방의 체력을 10 낮추고 나의 체력을 5 회복하고 싶어
        target.Hp -=10;
        this.Hp +=5;
        System.out.printf("공격자(%s)의 체력: %d, 상대방 체력:%d\n",this.Name,this.Hp,target.Hp);
    }

    // 캐릭터 정보 출력 메서드
    void info () {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n", Name,Level,Hp);
    }

} // class end

