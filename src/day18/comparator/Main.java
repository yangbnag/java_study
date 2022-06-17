package day18.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        List<Person> pList = new ArrayList<>();
        pList.add(new Person("송철수", 33));
        pList.add(new Person("박영희", 41));
        pList.add(new Person("차범근", 11));
        pList.add(new Person("김송희", 21));

        // 나이 순으로 오름차 정렬 (나이 적은 순)
//        pList.sort(new AgeAscendingComparator());

/*        pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        // 나이 오름차
//        pList.sort((o1, o2) -> o1.getAge() - o2.getAge()) ;
        //나이 내림차
//        pList.sort((o1, o2) -> o2.getAge() - o1.getAge()) ;
        // 나이 오름차
//        pList.sort(Comparator.comparingInt(Person::getAge)) ;
        // 나이 내림차
//        pList.sort(Comparator.comparingInt(Person::getAge).reversed()) ;


        // 이름 오름차
        pList.sort(new NameAscendingComparator());
/*        pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        */





        for (Person p : pList) {
            System.out.println(p);
        }


    }
}
