package day11.inherit;

public class Mage extends Player {

    public int mana; // 마력 게이지
    public String job = "마법사";

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }

    public void showStatus() {
        super.showStatus();     // 부모의 showStatus() 메서드 호출
        System.out.println("# mana : " + mana);

    }


    public void blizzard(Player... numbers) {
        System.out.println(name + "님 눈보라 마법 시전!");

        for (Player p : numbers) {
            if (p.name == this.name) {
                continue;
            } else {
                int rn = (int) (Math.random() * 15);
                p.hp -= rn;
                System.out.println(p.name + "님이 " + rn + "의 피해를 입었습니다. (남은체력 :" + p.hp + ")");
            }
        }
    }

}

/*
* public void blizzard(Player... targets) {
        System.out.printf("# %s님 눈보라 시전!!!!\n", this.name);
        System.out.println("======================================");


        for (Player p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.name, damage, p.hp);
        }
    }*/