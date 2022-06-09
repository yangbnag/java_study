package day12.static_.singleton;

import day08.modi.pac2.C;

// 싱글톤 패턴으로 생성자를 통한 객체를 한개만 생성
public class Controller {

    public int number;

    // 2. 필드로 객체를 딱 하나 생성시키는데
        // static 제한을 걸어서 공유객체로 전환
        private static Controller con;

        static{
            con = new Controller();
        }

    // 3. 준비된 단 하나의 객체를 public메서드를 통해 제공
    public static Controller getInstance(){
            if(con != null) return con;
            return new Controller();
    }

    // 1. 단 하나의 생성자에 private 제한을 걸어 외부에서 직접적으로 객체를 생성할 수 없도록 제한
        private Controller(){


        }


}
