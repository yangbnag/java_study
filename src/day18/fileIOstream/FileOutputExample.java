package day18.fileIOstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {

        // 파일 출력
        try(FileOutputStream fos = new FileOutputStream("E:/Exercise/dog.txt")) {

            String msg = "멍멍이는~~~ 멍멍멍멍~ 왈왈왈~~\n 하하호호"; //  Exercise/dog.txt 여기에 msg 변수에 저장된 문자를 저장 하고 싶다.

            fos.write(msg.getBytes()); // 바이트기반 으로 문자열을 받을수 없는데 스트링을 바이트로 바꾸면 사용 가능하다.

        } catch (FileNotFoundException e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 에러!");
        }


    }
}
