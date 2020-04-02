package com.example.composition2;

public class Wheel {
    private String mark;
    private int size;

    public Wheel(String mark, int size){
        this.mark = mark;
        this.size = size;
    }

    public void setMark(String mark){
        this.mark = mark;
    }
    public String getMark(){
        return mark;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        return mark;
    }
}
