package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] members = {"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
        System.out.println("삭제할 학생의 별명을 입력하세요!");

        while(true) {
            System.out.print(">>");
            String Delet = sc.next();
            int idx = -1;
            for (int i = 0; i < members.length; i++) {
                if (Delet.equals(members[i])) {
                    idx = i;
                    break;
                }
            }
            if (idx == -1) {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.", Delet);
                continue;
            } else {
                System.out.println(Delet +"의 별명을 삭제합니다.");
                for(int i=idx; i<members.length-1;i++) {
                    members[i] = members[i+1];
                }
                String[] temp = new String[members.length-1];
                for(int i=0; i<members.length-1; i++) {
                    temp[i] = members[i];
                }
                members = temp; temp=null;
                System.out.println("삭제 후 정보 : " + Arrays.toString(members));
                break;
            }
        }
    }
}
