package day08.player;

public class Main {
    public static void main(String[] args) {
        player park = new player("박찬호",1,50);
        player kim = new player("김철수",1,50);

        park.attack(kim);
        kim.attack(park);
        kim.attack(kim);


    }
}
