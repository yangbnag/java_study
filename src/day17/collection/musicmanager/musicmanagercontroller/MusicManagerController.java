package day17.collection.musicmanager.musicmanagercontroller;

import day17.collection.musicmanager.mo.vo.Artist;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MusicManagerController {

    private Artist artist;

    private Map<String, Artist> map = new HashMap<>();

    public MusicManagerController() { }

    public MusicManagerController(Artist artist, Map<String, Artist> map) {
        this.artist = artist;
        this.map = map;
    }

    // 등록된 가수 노래 추가 하기
    public void add(String key, String music) {
        if(map.containsKey(key)) // 존재하는 가수이면
        {
           Artist target = map.get(key);
          List<String> list = target.printTitle(); // 아티스트의 노래 리스트 주소값 반환

           if(list.contains(music)) // 존재하는 노래이면
                {
                    System.out.println("#이미 등록된 노래 입니다.");
           }else {
               list.add(music);
               System.out.println("#아티스트" + key +"님의 노래목록에 "+ music +"곡이 추가되었습니다.");
           }
        }
        else {             // 신규 가수이면 새로 등록
            map.put(key, new Artist(key, new String[]{music}));
            map.get(key).printTitle().add(music);

            System.out.println("#아티스트" + key +"님이 신규 등록 되었습니다.");
        }
    }

    // 노래 조회 하기
    public void searchMusic(String key){
       if(map.containsKey(key)) {
// 검색한 가수가 등록 되어 있을 때
           System.out.println(key+"님의 노래목록");
           System.out.println("================");
           Artist target = map.get(key);
           List<String> list = target.printTitle();
           for (String s : list) {
               System.out.println(s);
           }
       } else System.out.println("해당 가수는 등록되지 않은 가수 입니다.");
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Map<String, Artist> getMap() {
        return map;
    }

    public void setMap(Map<String, Artist> map) {
        this.map = map;
    }
}
