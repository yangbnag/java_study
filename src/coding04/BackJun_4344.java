package coding04;

import java.util.Arrays;
import java.util.Scanner;

public class BackJun_4344 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int caseN = sc.nextInt(); // 실행할 케이스의 정수
        for (int i = 0; i <caseN ; i++) {
            int Num = sc.nextInt(); // 저장할 점수의 개수
            int [] scoreList = new int[Num]; // 점수를 저장할 변수
            int sum = 0; // 점수의 합계를 저장할 변수

            for (int j = 0; j < Num; j++) {
                scoreList[j] = sc.nextInt();
            }

            // 학생들의 총점 구하기
            for (int k = 0; k <scoreList.length; k++) {
                sum += scoreList[k];
            }
            // 학생들의 평균 구하기
            double avr = (double) sum / scoreList.length;

            // 평균인 학생들 구하기
            int cnt = 0; // 평균을 넘는 학생들을 카운터할 변수
            for (int l = 0; l <scoreList.length ; l++) {
                if (scoreList[l] > avr) {
                    cnt++;
                }
            }
            // 평균을 넘는 학생들의 비율 구하기
            double percent = ((double)cnt / scoreList.length)*100 ;

            System.out.printf("%.3f%%\n",percent);

        }






    }
}