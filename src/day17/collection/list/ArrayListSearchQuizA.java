package day17.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListSearchQuizA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tvxq = new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );
        System.out.println("* 변경 전 정보: " + tvxq);

        while(true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.printf(">> ");
            String targetName = sc.next();

          int index = tvxq.indexOf(targetName);

            if (index != -1) {
                System.out.printf("%s의 별명을 변경합니다.\n", targetName);
                System.out.printf(">> ");
                String newName = sc.next();
                tvxq.set(index,newName);
                System.out.println("변경 완료!!");
                System.out.println("* 변경 후 정보: " + tvxq);
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        }
        sc.close();

        }
    }

