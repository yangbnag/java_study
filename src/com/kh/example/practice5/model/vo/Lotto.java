package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
    // 필드 설정
    int[] lotto;
    // 초기화는 생성자에서 초기화

    // 생성자
    public Lotto() {
        lotto = new int[6];
        // 로또번호를 6개 생성하여 배열에 넣는 메서드 호출
        makeLotto();
    }

    // 메서드
    public void makeLotto() {
        for (int i = 0; i < lotto.length; i++) {
            // 1 ~ 45 범위의 랜덤정수
            int rn = (int) (Math.random() * 45 + 1);
            if (!isDuplicate(rn)) // 만약 중복 숫자가 아니라면
                lotto[i] = rn;
            else {
                i--; // 중복된 경우
            }
        }
    }
    // 중복 검사
    public boolean isDuplicate(int rn) {
        for (int n : lotto) {
            if(rn == n) return true;
        }
        return false;
    }

    // 결과값 출력
    public void information() {
        System.out.println(Arrays.toString(lotto));
    }
}
