package day17.collection.map;

import utility.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student {
    String name; // 이름
    int grade; // 학년

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class MapExample {

    public static void main(String[] args) {

        Map<String, Student > map = new HashMap();

        // #! put(k, v) : 데이터 추가
        map.put("짹짹이", new Student("김철수",3));
        map.put("짹짹이", new Student("박철수",3));
        map.put("짹짹이", new Student("송싹",3));
        map.put("냥냥이", new Student("도우너",5));
        map.put("멍멍이", new Student("고길동",1));

        System.out.println(map.size()); // 키 값이 중복되면 마지막에 put된 데이터만 추가된다.
        System.out.println(map);

        // 중복된 key 객체로 put을 하면 value가 수정된다.
        map.put("냥냥이", new Student("둘리",6));
        System.out.println(map);

        // #! get(ket) : 저장된 value 참조
        Student student = map.get("멍멍이");// 멍멍이 key를 가진 Student 객체가 리턴 된다.
        System.out.println("student = " + student);

        student.name = "빠빠빠"; // student는 map의 멍멍이 key 객체 주소로 연결 되어 있어서
        System.out.println(map); // student를 수정하면 map도 수정 된다.

        // #! containsKey(key) : map에 key가 있는지 유무 확인
        Util.line();
        System.out.println("diq");
        System.out.println(map.containsKey("꽉꽉이"));
        System.out.println(map.containsKey("짹짹이"));

        // #! map 루프 처리 [map은 이터러블이 없다.]
//        for (Student s : map) { }
        Set<String> keySet = map.keySet();// map의 모든 키를 Set에 담아 리턴
        System.out.println(keySet);
        for (String key : keySet) {
            System.out.println(map.get(key)); // map -> key -> set -> 반복문
        }

        // #! remove(key) : key에 해당하는 Entry 삭제
        map.remove("냥냥이");
        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty());

        // 맵에 value값으로 List를 사용하려면
        Map<String, List<Integer>> mapList = new HashMap<>();


    }

}
