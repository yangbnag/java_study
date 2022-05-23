package day04;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner sc = new Scanner(System.in);

        System.out.println("변경 전 정보: " + Arrays.toString(members));
        System.out.println("- 수정할 멤버의 이름을 입력하세요.");

while(true) {
    System.out.println(">> ");
    String inputName = sc.next();

    int index = -1; // 찾은 인덱스를 저장할 변수

    for (int i = 0; i < members.length; i++) {
        if (inputName.equals(members[i])) {
            index = i;
            break;
        }
    }
    if (index == -1) {
        System.out.printf("%s은(는) 없는 이름 입니다.", inputName);
        continue;

    } else {
        System.out.println(members[index] + "의 별명을 변경합니다.");
        String nickname = sc.next();
        members[index] = nickname;
        System.out.println("변경완료!");
        System.out.println("변경 후 정보: " + Arrays.toString(members));
        break;
    }
}



    }

}

