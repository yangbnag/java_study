package day16.api.time;

import utility.Util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {

        // 현재 날짜 정보 얻기 (연, 월, 일 )
        // Java.time 패키지
        LocalDate now = LocalDate.now();
        System.out.println(now);

        Util.line();

        // 현재 시간 정보 얻기(시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(LocalTime.now());
        LocalTime a = nowTime;
        System.out.println(a); // 14:53:22.472727100

        // 현재 날짜와 시간 정보 얻기(연, 월, 일, 시, 분, 초)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        // 특정 날짜와 시간 정보 얻기
        // ex) 이벤트 시작일자와 이벤트 종료일자
        LocalDateTime beginData = localDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println(beginData);

        // 연도 추출하기
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        // 월 추출 하기
        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);

        int hour = localDateTime.getHour();
        System.out.println("hour = " + hour);

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);

        Util.line();
        // 지금으로 부터 3일 뒤의 시간을 구하고 싶다. (ex) 도서대여 3일 기간이다. 잔여 대여 시간 알아내기)
        LocalDateTime returnDate = localDateTime.plusDays(3);
        System.out.println("반납일 = " + returnDate);

        // 지금으로 부터 1년 2개월 7일 뒤
/*        LocalDateTime d1 = localDateTime.plusYears(1);
        LocalDateTime d2 = d1.plusMonths(2);
        LocalDateTime d3 = d2.plusDays(7);
        System.out.println("d3 = " + d3);*/

        LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);
        System.out.println("d1 = " + d1);
        LocalDateTime d2 = localDateTime.minusYears(1).minusMonths(2).minusDays(7);
        System.out.println("d2 = " + d2);

        Util.line();
        // 사이 날짜 연산
        LocalDate b = LocalDate.of(2020, 12, 30); // 시작일
        LocalDate f = LocalDate.of(2022, 9, 14); // 종료일

        // 시작일 b 와 종료일 f의 사이 날짜를 알고 싶다.
        long between = ChronoUnit.DAYS.between(b, f);
        System.out.println("between = " + between);

        System.out.println(" \n\n\n\n ");
        Util.line();
        System.out.println(" \n\n\n\n ");




        // 날짜 포맷 변경하기
        System.out.println(localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 m분 ss초");
        System.out.println(localDateTime.format(dtf));

    }
}
