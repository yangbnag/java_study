package coding05Method;

public class BackJun_15596 {
    static long sum(int[] a) {
        long ans = 0;
        for (int i : a) {
            ans += i;
        }
        return ans;
    }
    public static void main(String[] args) {

       long result = sum(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(result);

    }
}
