package org.templatemethod;

public abstract class AbstractDisplay {
    //open, print, close 는 하위 클래스에 구현을 맡기는 추상 메소드
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //display 는 AbstractDisplay 에서 구현하는 메소드
    //open, print, close 의 추상메소드를 오버라이드 하여 재 정의함
    public final void display(){
        open();
        for(int i=0; i< 5; i++){
            print();
        }
        close();

    }


}
