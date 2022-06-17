package day17.collection.musicmanager.view;

import day17.collection.musicmanager.mo.vo.Artist;
import day17.collection.musicmanager.musicmanagercontroller.MusicManagerController;
import utility.Util;

import java.util.Scanner;

public class MainMenu {

    MusicManagerController mmc = new MusicManagerController();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        mmc.makeDirectory();
        mmc.load();

        while(true) {
        int s = mmc.getMap().size();
            System.out.println("*****음악 관리 프로그램*****");
            System.out.printf("# 현재 등록된 가수 : %d명\n", s);
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            System.out.println("===================");


            int menu = Util.inputN("메뉴를 선택하세요.");

            switch (menu) {
                case 1:
                    add();
                    mmc.sava();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    return;
                default:
                    return;
            }
        }
    }

    public void add(){
        System.out.println("노래 등록을 시작합니다.");
        String key = Util.inputS("가수명: ");
        String music = Util.inputS("곡명: ");
        mmc.add(key,music);
    }

    public void search(){
        System.out.println("검색할 가수명을 입력하세요.");
        String key = Util.inputS("가수명: ");
        mmc.searchMusic(key);


    }



}
