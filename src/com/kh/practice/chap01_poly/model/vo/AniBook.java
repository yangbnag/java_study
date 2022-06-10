package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {

    private int acceseAge;

    public AniBook() {
    }

    public AniBook(String title, String author, String publisher, int acceseAge) {
        super(title, author, publisher);
        this.acceseAge = acceseAge;
    }

    @Override
    public String toString() {
        return "AniBook{" +
                "acceseAge=" + acceseAge +
                '}';
    }

    public int getAcceseAge() {
        return acceseAge;
    }

    public void setAcceseAge(int acceseAge) {
        this.acceseAge = acceseAge;
    }
}
