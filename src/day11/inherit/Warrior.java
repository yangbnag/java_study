package day11.inherit;

    // 자식 클래스 (sub class)
public class Warrior extends Player {

    public int rage; // 분노게이지

        public String job = "전사";

    public Warrior(String name) {
          super(name);
        // Player는 누가 호출 하였는가?
        // super();가 생략 되어 있다.
//        super(); // super(); 부모의 생성자를 호출    //ex) this(); ← 나의 생성자를 호출
        this.rage = 50;
        // 원칙적으로 말하면 this.level 은 super.level이 맞다.

        System.out.println("Warrior 생성자 호출!");
    }


       public void showStatus() {
            super.showStatus();     // 부모의 showStatus() 메서드 호출
            System.out.println("# rage : " + rage);

        }


    public void rush(Player target) {
        System.out.println((target instanceof Warrior));
        if(target instanceof Warrior) {
            System.out.println(name + "님이" + target.name+"님에게 FireRush를 시전했습니다.");
            target.hp -= 10;
            System.out.println(target.name+ "님이 " + 10 +"의 피해를 입었습니다.");
        }

        System.out.println(name + "님이" + target.name+"님에게 FireRush를 시전했습니다.");
        int rn = (int)(Math.random() * 20);
        target.hp -= rn;
        System.out.println(target.name+ "님이 " + rn +"의 피해를 입었습니다.");

    }

}

/*
* public void rush(Player target) {
        System.out.printf("%s님이 %s님에게 FireRush를 시전했습니다!\n"
                , this.name, target.name);
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.name, job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.name, target.hp);
        System.out.println();
    }*/