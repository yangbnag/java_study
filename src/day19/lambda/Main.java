package day19.lambda;

import utility.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day19.lambda.Book;
import static day19.lambda.Apple.*;
import static day19.lambda.Apple.Color.RED;
import static day19.lambda.Book.Genre.*;
import static day19.lambda.FilteringApple.*;

public class Main {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(80, Color.GREEN));
        inventory.add(new Apple(155, Color.GREEN));
        inventory.add(new Apple(120, RED));
        inventory.add(new Apple(90, Color.GREEN));
        inventory.add(new Apple(110, RED));
        inventory.add(new Apple(50, RED));

       List<Apple> greens =  filterGreenApple(inventory);

        for (Apple ga : greens) {
            System.out.println(ga);
        }

        // 빨강 사과들만 필터링

        for (Apple ra : filterApplesByColor(inventory, RED)) {
            System.out.println(ra);
        }

        // 무게가 100보다 큰 사과들만 필터링
        System.out.println("filtered apple weight over 100");
        for (Apple ha : filterApples(inventory, new AppleColorPredicate())) {
            System.out.println(ha);
        }

        Util.line();

        System.out.println("filter with anonymous class");
        // 무게가 100 보다 작은 사과들만 필터링
        System.out.println("weight under 100");
       List<Apple> lightAppleList =  filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 100;
            }
        });

        for (Apple la : lightAppleList) {
            System.out.println(la);
        }

        System.out.println("빨간색이면서 100그램 이상인 사과들만 필터링");
        List<Apple> filteredList =  filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED && apple.getWeight() > 100;
            }
        });
        for (Apple apple : filteredList) {
            System.out.println(apple);
        }


        Util.line();

        System.out.println("filter with lambda class");
        // 무게가 100 보다 작은 사과들만 필터링
        System.out.println("weight under 100");
        List<Apple> lightAppleList2 =  filterApples
                (inventory, a -> a.getWeight() < 100);

        for (Apple la : lightAppleList2) {
            System.out.println(la);
        }


//            System.out.println("filter with lambda class");
//           System.out.println("빨간색이면서 100그램 이상인 사과들만 필터링");
//    List<Apple> filteredList2 =  filterApples
//            (inventory, a-> a.getColor() == RED && a.getWeight() > 100);

//        for (Apple apple : filteredList2) {
//        System.out.println(apple);
//    }


    List<Book> bookList = new ArrayList<>();
        bookList.addAll(
                Arrays.asList(
                new Book(10000, HISTORY)
                        , new Book(20000, ESSAY)
                        , new Book(15000, HISTORY)
                        , new Book(14000, BIBLE)
                        , new Book(17000, COMICS)
                        , new Book(13000, COMICS)
                )
                        );

    // 만화책만 전부 필터링
    List<Book> filteredBooks
            = filter(bookList, b -> b.getGenre() == COMICS);

        for (Book fb : filteredBooks) {
        System.out.println(fb);
    }

    // 정수 리스트
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    // 홀수만 필터링
    List<Integer> integers = filter(numbers, n -> n % 3 == 0);
        for (Integer n : integers) {
        System.out.println(n);
    }
    }
}
