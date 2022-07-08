public class Main {
    public static void main(String[] args) {


        int id = 1;
        int pw = 2;

        int testId = 1;
        int testPw = 2;

        if (id != testId){
            System.out.println("아이디가 틀립니다.");
        } else if (pw != testPw) {
            System.out.println("비밀번호가 틀립니다.");
        } else System.out.println("로그인 성공");



    }
}

