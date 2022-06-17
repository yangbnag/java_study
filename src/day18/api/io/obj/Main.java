package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {

        humanList.add(new Human("김철수", 22, "서울시 금천구"));
        humanList.add(new Human("박영희", 24, "서울시 금천구"));
        humanList.add(new Human("홍길동", 45, "서울시 중구"));

//        svaeTextFile();
        saveObject();
    }
    // 고전적 방법보다 간단한 방법으로 저장하기 (객체 세이브 기능 )
    static void saveObject(){
        // 리스트를 통째로 세이브 파일로 보내기
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/Exercise/human.sav"))) {

            oos.writeObject(humanList); // 객체를 저장하려면 데이터를 바이트 형태로 직렬화 해야 한다.
                                        // 휴먼이 직렬화 되어 있지 않다는 에러 발생


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    // 텍스트 파일로 저장하는 고전적인 방법 (7~80년대)
    // 세이브 기능
    /*static void svaeTextFile(){
        try(FileWriter fw = new FileWriter("E:/Exercise/human.txt")){

            StringBuilder sb = new StringBuilder();
            for (Human h : humanList) {
                fw.write(String.format("%s,%d,%s\r\n",h.getName(),h.getAge(),h.getAddress()));
            }
            System.out.println("저장완료");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
