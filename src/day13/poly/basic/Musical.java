package day13.poly.basic;

class 배우 {
}

class 장동건 extends 배우 {
}

class 원빈 extends 배우 {
}

public class Musical {

    배우 연기파배우;

    // 동건이가 아파서 뮤지컬 바꿔야 할 경우
    void changActor() {
        연기파배우 = new 원빈(); // 원빈을 쓸수 없네네
    }
}

