package day18.api.io.file;

import java.io.*;

public class FileExample {

    public static final String ROOT_PATH = "E:/Exercise";

    public static void main(String[] args) {

        // 폴더 생성
        File dir = new File(ROOT_PATH + "/Dir/hello");

        // 폴더 생성 명령
        // !dir.exists() 이 폴더에 없으면 만들어라 ! 라는 조건문
        if (!dir.exists()) dir.mkdirs();// .mkdirs(); 는 폴더생성 명령한데로 생긴다.
        // .mkdir(); 는 마지막 폴더 하나만을 생성한다. 경로를 찾아가는데
        // 마지막 폴더 전에 있는 폴더가 없으면 만들지 않는다.

        // 파일 생성
        File file1 = new File(ROOT_PATH+"/file1.txt");
        File file2 = new File(ROOT_PATH+"/file2.txt");
        File file3 = new File(ROOT_PATH+"/file3.txt");

        try {
            // 파일 생성 명령
            if (!file1.exists()) file1.createNewFile();
            if (!file2.exists()) file2.createNewFile();
            if (!file3.exists()) file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }//(try~catch를 하는 이유는 메서드에서 throws로 예외를 호출부로 떠넘겼기 때문에)
        //(에러는 생성하고자 하는 파일의 위치가 입력된 경로와 다를경우 발생)

        // 폴더, 파일 정보 읽기
        File exercise = new File(ROOT_PATH);

        // 해당 디렉토리 모든 파일 정보 얻기
        File[] files = exercise.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("Directory - 폴더명: %s\n", f.getName());
            } else {
                System.out.printf("File - 파일명: %s, 크기: %d\n", f.getName(), f.length());
            }
        }

    }
}