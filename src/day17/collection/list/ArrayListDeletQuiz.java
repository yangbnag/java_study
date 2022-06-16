package day17.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListDeletQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> members = new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );
        while (true) {
            System.out.println("삭제할 학생의 별명을 입력하세요!");
            System.out.print(">>");
            String Delet = sc.next();
            int idx = members.indexOf(Delet);

            if (idx == -1) {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.", Delet);
                continue;
            } else {
                System.out.println(Delet + "의 별명을 삭제합니다.");
                members.remove(idx);
                System.out.println("삭제 후 정보 : " + members);
                sc.close();
                break;
            }
        }
    }
}
