package day09.objarr;

public class Person {

    String name; //이름
    int money; // 현재 소유한 현금

    // 통장 정보 - 통장은 1개만 소유할 수 있다 가정
    Account myAccount; // 객체안에 객체개념 (타입:Account person 의필드:myAccount)
    // 자바스크립트로 보면 myAccount : {};

    //생성자
    Person(String name) {
        this.name = name;
        this.money =0; // money와 myAccount는 굳이 안써도 된다.
        this.myAccount = null; // 초기값으로 생성되기 때문에에
   }

   // 계좌 개설 기능
    void makeAccount(Bank bank){
        //신규 계좌 생성
        this.myAccount = new Account(this); // 내정보를 줘야 하기 때문에 this
        // 계좌를 만들어서 내 정보를 넣었으면 내 계좌에 등록해줘야함.
        // 신규 계좌의 은행명 필드 초기화
        myAccount.bankName = bank.bankName;
        //은행에 계좌정보 등록
        bank.registry(myAccount);
        System.out.printf(" %s 은행에 %s님의 계좌가 신설되었습니다.\n ",bank.bankName,this.name);

    }

    // 입금 기능
    void deposit(int depositMoney) {
        if (money >= depositMoney) {
            // 내 통장 잔액 증가
            myAccount.balance += depositMoney;
            // 내 현금 잔액 감소
            this.money -= depositMoney;
            System.out.printf("%s은행 계좌에 %d원이 입금되었습니다.\n"
                    , myAccount.bankName, depositMoney);
        } else {
            System.out.printf("입금 실패! 소지금이 %d원 더 필요합니다.\n"
                    , depositMoney - this.money);
        }
    }

    // 계좌 이체 기능
    void sendMoney(Person target, int money){
        //돈 받을 사람 = target, 보낼 금액 = money
        if(this.myAccount.balance >=money) {
            //상대방의 예금잔액이 이체액만큼 증가
            target.myAccount.balance += money;
            // 나의 예금잔액이 이체액만큼 감소
            this.myAccount.balance -= money;
            System.out.printf("%s님이 %s님에게 %d원을 송금했습니다.\n",this.name,target.name,money);
        }else {
            System.out.println("계좌 이체 실패 - 잔액 부족!");
        }

    }
    // 잔액 조회 기능
    void checkBalance(){
        System.out.printf("%s님의 현제 예금잔액은 %d원 입니다.\n", this.name, this.myAccount.balance);
    }

}
