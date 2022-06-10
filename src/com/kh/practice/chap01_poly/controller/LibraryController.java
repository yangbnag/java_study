package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

    Member mem;
    Book[] bList = new Book[5];

    public int existBookNum(){
        int count = 0;
        for (int i = 0; i < bList.length; i++) {
            if (bList[i] != null){
                count++;
            } else break;
        } return count;
    }

//    public int searchByIndex(){
//    }

    public void insertMember(Member mem){
        this.mem = mem;
    }

    public Member myInfo(){

        return mem;
    }

    public Book[] selectAll(){
        return bList;
    }

    public Book[] searchBook(String name) {
        Book[] searchArr = new Book[existBookNum()];
        int count = 0;
        for (Book b : bList) {
            if(b.getTitle().contains(name)){
                searchArr[count++] = b;
            }
        }
        return searchArr;
    }

    public int rentBook(int index) {
        int result = 0;
       if(bList[index] instanceof AniBook) {
           AniBook aniBook = (AniBook) bList[index];
           if(aniBook.getAcceseAge() >= mem.getAge()) {
               result = 1;
               return result;
           }

           if(bList[index] instanceof CookBook) {
               CookBook cookBook = (CookBook) bList[index];
               if (cookBook.isCoupon()){
                   mem.setCouponCount(mem.getCouponCount()+1);
                   result = 2;
                   return result;
               }
           }
       }
        return result;
    }

}
