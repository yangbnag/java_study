package coding02;

import java.util.Scanner;

public class BackJun_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentH = sc.nextInt(), currentM = sc.nextInt();
        int ovenTime = sc.nextInt();

        //  22:10 + 80
        int addH = (currentM + ovenTime) / 60;
        int addM = (currentM + ovenTime) % 60;

        // 현재 시간에 추가 시간을 더했을 때 시간이 변하는 경우
        int overM = currentM + ovenTime;
        // int overM = currentM+ovenTime > 60;
//        currentH+addH, addM

        // 현재 시간에 추가 시간을 더했을 때 시간이 변하는데 23시에서 0시로 넘어갈 경우
//        int overH = currentH + addH;
//        int overH = currentH+addH >=24 이고 overM >= 60; 일때

//        if (overH >= 24 && overM >=60) {

//        }


            if ((currentM + ovenTime) >= 60 && (currentH >= 23)) {
                int newH = (currentH+((currentM+ovenTime) / 60)) /24 ;
                int newM = ((currentM + ovenTime) % 60);
                System.out.printf("%d %d", newH, newM);

            } else if ((currentM + ovenTime) >= 60) {
                int newH = currentH + ((currentM + ovenTime) / 60);
                int newM = ((currentM + ovenTime) % 60);
                System.out.printf("%d %d", newH, newM);
            } else {
                System.out.printf("%d %d", currentH, (currentM + ovenTime));
            }

    }

        /*
        14 : 30
        20
        -> 14 : 50
        (currentM + ovenTime) < 60 이면
        출력 currentH (currentM+ovenTime)
        //

        17:40
        80
        -> 19:00
        (currentM + ovenTime) > 60 이면
        int newH = currentH + ((currentM+ovenTime)/60)
        int newM = (currentM+ovenTime%60)

        //

      (currentM + ovenTime) > 60 이고, (currentH == 23) 일때
        int newH = -1 + ((currentM+ovenTime)/60)
        int newM = (currentM+ovenTime%60)

        23:48
        25
        -> 0:13
         */

}


