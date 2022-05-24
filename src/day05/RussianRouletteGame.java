package day05;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class RussianRouletteGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 게임인원을 입력 받는다.
        System.out.printf("게임인원==>");
        int playerNum = sc.nextInt();


        //player 저장할 배열 생성
        String[] playerList = new String[playerNum];

        //플레이어 이름을 등록하기
        System.out.println("플레이어 이름을 등록합니다.");
        for (int i = 0; i < playerNum; i++) {

            System.out.printf("%d번 플레이어 이름 : ", i + 1);
            playerList[i] = sc.next();
        }
        System.out.println(Arrays.toString(playerList) + "참가!");

        System.out.println("\n\n");

        //실탄 개수 등록
        System.out.printf("실탄개수 (1~5개) ==>");
        int shot = sc.nextInt();
        sc.nextLine();
        System.out.print("실탄을 넣고 탄창을 무작위로 돌립니다.\n\n");

        // 먼저 시작할 사람 정하기
        int startPlayer = (int) Math.floor(Math.random() * playerNum);

        // 사망조건으로 나온 랜덤숫자 저장할 배열 만들기
        int[] deathCondition = new int[shot];

        // 사망조건 총알 갯수만큼 숫자 지정하기
        for (int i = 0; i < shot; i++) {
            int rn = (int) Math.floor(Math.random() * 6) + 1;
            deathCondition[i] = rn;
        }

        //먼저 총을 쏠 플레이어 안내 메시지
        System.out.println("총을 돌렸습니다." + playerList[startPlayer] + "부터 시작 합니다.");

        // 게임시작 준비 메시지
        System.out.println("[" + playerList[startPlayer] + "님의 턴!] 탄창 실린더를 무작위로 돌립니다.\n 엔터를 누르면 격발합니다.");

        int answerCount = 0;
        // 죽은 회수가 총알 숫자랑 똑같으면 종료.
        while(shot==answerCount) {

            String start = sc.nextLine();
            // 엔터를 눌렀을때 플레이어가 얻게되는 숫자
            int rn = (int) Math.floor(Math.random() * 6) + 1;
            // 총알을 쏴서 죽은 횟수 == 맞춘 횟수

            for (int i = 0; i < deathCondition.length; i++) {
                if (rn == deathCondition[i]) {
                    System.out.println("빵!!!" + playerList[startPlayer] + "님 사망..");
                    answerCount++;

                } else System.out.println("휴... 살았습니다.");
                break;
            }

        }


    }
}
