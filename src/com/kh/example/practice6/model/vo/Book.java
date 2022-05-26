package com.kh.example.practice6.model.vo;

public class Book {
    // 필드
    String title;
    String publisher;
    String author;
    int price;
    double discountRate;

    // 생성자
    Book() {}
    public Book(String ntitle, String npublisher, String nauthor) {
        title = ntitle;
        publisher = npublisher;
        author = nauthor;
    }

  public Book(String ntitle, String npublisher, String nauthor,
          int nprice, double ndiscountRate) {
      title = ntitle;
      publisher = npublisher;
      author = nauthor;
      price = nprice;
      discountRate = ndiscountRate;

  }

    // 메서드
    public void inform(){
        System.out.printf("%s, %s, %s,%d원, %f%%", title,publisher,author,price,discountRate);
    }

}
