package com.kh.practice.chap02_abstractNInterface.model.vo;


public abstract class SmartPhone implements CellPhone, TouchDisplay {
    private String maker; // 제조사 정보

    public SmartPhone(){};

    public abstract String printlnformation();

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getMaker(){
        return this.maker;
    }


    @Override
    public String charge() {
        return null;
    }

    @Override
    public String makeCall() {
        return null;
    }

    @Override
    public String takeCall() {
        return null;
    }

    @Override
    public String touch() {
        return null;
    }

    @Override
    public String picture() {
        return null;
    }
}
