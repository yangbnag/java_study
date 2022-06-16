package day17.collection.set;

import utility.Util;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        // set: 중복 저장을 허용하지 않는다. 데이터 삽입속도가 빠름. 순서없이 저장
        Set<String> set = new HashSet();

        // add(E e) : 객체 추가
        set.add("김말이"); // 데이터가 성공적으로 저장 되었는지 여부를 리턴함.
        set.add("닭꼬치");
        set.add("단무지");
        set.add("김말이");
        set.add("김밥");
        boolean b1 = set.add("1");
        boolean b2 = set.add("2");

        // size : 저장된 객체 수 리턴
        System.out.println(set.size()); // 중복 저장을 허용하지 않기 때문에 사이즈 = 4;
        System.out.println(set); //삽입한 순서대로 저장되지 않는다.
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // set의 루프처리
        Util.line();

        for (String s : set) {
            System.out.println(s);
        }

        // remove(obj) : 객체 삭제 (인덱스가 없어서 객체 직접 선택 삭제)
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,2,2,2,4,5,6,7,8,8,8,9,1));


        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numbers);
        //set에 리스트를 통째로 넣어도 된다. // 중복이 자동으로 걸러진다.
        System.out.println(numberSet);
        numbers.clear();
        numbers.addAll(numberSet); // Set으로 중복 제거 후 다시 배열로 이동(인덱싱 활용)
        System.out.println(numbers);
    }
}
