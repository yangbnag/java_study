package codingtest.programmers.level1;

//하샤드 수
class L12947 {
    public static boolean solution(int x) {

        int dx = x; // 처음 x값 백업
        int sum = 0; //자리수 총합
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return dx % sum == 0;

    }

    public static void main(String[] args) {
        System.out.println(solution(556));
    }
}