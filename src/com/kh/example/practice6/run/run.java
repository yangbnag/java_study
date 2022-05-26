package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class run {
    public static void main(String[] args) {

        Book b1 = new Book("소나기","시나공","황순원");
        Book b2 = new Book("매의눈","챔프","몰랑",3500,20);

        b1.inform();
        System.out.println();
        b2.inform();

    }
}
