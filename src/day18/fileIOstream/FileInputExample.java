package day18.fileIOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
    // Node.java 파일을 읽어 들이고 싶다.
    public static void main(String[] args) {

        //파일을 읽어들이려면

        try(FileInputStream fis = new FileInputStream("E:/java_study_a/src/datastructure/chap02/linkedlist/singly/Node.java") ) {
       // try with resource : AutoCloseable 인터페이스가 구현된 객체를 자동 클로즈
            // try ( 탐색할 경로 변수 생성 )

            int data = 0;
            while (data != -1) {
                data = fis.read();
                System.out.write(data); // 아스키를 문자로 출력
            }
            System.out.println("data = " + (char)data);

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");;
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        }
            }
        }



       /* FileInputStream fis = null;// 선언 분리
        try {
            fis = new FileInputStream("E:/java_study_a/src/datastructure/chap02/linkedlist/singly/Node.java");// 읽고 싶은 파일의 경로를 써줘야 한다.


            int data = 0;
            while (data != -1) {
                data = fis.read();
                System.out.write(data); // 아스키를 문자로 출력
            }

            System.out.println("data = " + (char)data);


        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");;
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        } finally {
            try {
                if(fis != null) fis.close(); // Stream을 에러가 발생하든 하지 않든 종료선언을 해줘야 한다.
            } catch (IOException e) {
                // Stream close 하는데 할게 너무 많다...
                // Java에서는 오토클로징을 제공한다.!

            }
        }*/





