package day07;

public class StringMethod {
    public static void main(String[] args) {

        String str = "hello java";
        // 0123456789

        //charAt(index):문자열 인덱스에 따른 단일문자 변환
        char c = str.charAt(4);
        System.out.println(c);

        //substring(beginIdx, endIdx)
        //:문자열의 특정 범위를 추출
        String ss1 = str.substring(1, 5); // 1이상 5 미만
        System.out.println("ss1: " + ss1);

        String ss2 = str.substring(6); // 6번 부터 끝까지
        System.out.println("ss2: " + ss2);

        //length(): 문자열의 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len); // 공백도 문자로 포함

        //indexOf(str)
        int idx = str.indexOf("l"); // l의 인덱스 번호를 찾는 함수(앞에서 부터 탐색)
        // "hello java" 는 l 이 2개가 있는데 먼저 탐색된 인덱스 번호를 반환한다.
        System.out.println("l = " + idx);

        int idx2 = str.lastIndexOf("l"); // l의 인덱스 번호를 찾는 함수(뒤에서 부터 탐색)
        System.out.println("l = " + idx2);

        // 해당문자가 존재하지 않으면 -1을 리턴

        //일괄 대소문자 변경
        String str2 = "HeLLo PORorO";
        String lower = str2.toLowerCase(); // 소문자 변경
        System.out.println("lower = " + lower);
        String upperCase = str2.toUpperCase(); // 대문자 변경
        System.out.println("upperCase = " + upperCase);

        // replace(old, new) : 문자열 내부에 old 문자를 모두 탐색하여 new 문자로 변환
        String str3 = "python study, python app, python data";
        String replace = str3.replace("python","java");
        System.out.println(replace);

        // 문자열 함수 활용 예시
        // 파일 경로에서 확장자 추출
        String filePath = "D:/local/img/2022/05/26/lalalala.jpg";
                         //012345678901234567890123456789012345
        // 문자열길이 마지막에서 부터 .을 만날때 까지 문자열 추출
        int length = filePath.length();
        System.out.println(length);
        int targetIdx = 0;
        int i = 0;
        for (i = filePath.length()-1; i > 0 ; i--) {
            if(filePath.charAt(i) == '.') {
                targetIdx = i;
                break;
            }
        }
        System.out.println(i);
        String fileN = filePath.substring(i+1);
        System.out.println(fileN);

        // 다 간단하게
        String ext = filePath.substring(filePath.lastIndexOf(".")+1);
        System.out.println("ext = " + ext);

        switch (ext.toLowerCase()) {
            case "jpg": case "gif": case "png": case "svg":
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("이미지 파일이 아닙니다.");
        }

                //문자열의 정수 변환
                String s1 = "100";
                String s2 = "200";
                // s1과 s2를 더해서 300을 만들고 싶다.

                // 문자열 -> 정수 : Integer.parseInt(str);
                // 문자열 -> 실수 : Double.parseDouble(str);
                // 문자열이 아닌것 -> 문자열 : String.valueOf(data);

                int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
                System.out.println("sum: "+sum);





    }
}
