package day13.poly;

import day11.inherit.Hunter;
import day11.inherit.Mage;
import day11.inherit.Player;
import day11.inherit.Warrior;

public class PlayerQuiz {

    public static void main(String[] args) {
        Player m = new Mage("눈보라왕");
        Player w = new Warrior("주차왕파킹");
        Player h = new Hunter("멍멍이조아여");


        ((Mage)m).blizzard(w,m,h,new Mage("아우"));
        ((Warrior)w).rush(new Warrior("아파"));
        ((Warrior)w).rush(m);



    }

}
