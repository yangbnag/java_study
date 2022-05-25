package coding05Method;

import java.util.Arrays;

public class BackJun_4673 {
    public static void main(String[] args) {

        //1~10000 까지
        //구한 값을 넣을 배열
        int[] arr = {1,10,100,1000,10000};
        int[] temp = new int[arr.length];
        int aNum = 0;

        for (int i = 0; i<arr.length; i++) {
            int arrContent = arr[i];
            System.out.println(arrContent);

            while(true){
                aNum += (arrContent%10);
                System.out.println();
                
                arrContent = arrContent/10;
                if(arrContent<0) break;
            }
            temp[i] = aNum;
        }//for end
        System.out.println(Arrays.toString(temp));
    } // main end
} // class end
