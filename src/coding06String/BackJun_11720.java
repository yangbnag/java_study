package coding06String;

import java.util.Scanner;

public class BackJun_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        String num = sc.next();
        if(n == num.length()){
        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(num);
        }}
        System.out.println(total);



    }
}
