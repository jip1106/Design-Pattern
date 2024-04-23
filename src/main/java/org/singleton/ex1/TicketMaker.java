package org.singleton.ex1;

public class TicketMaker {
    //Singleton 패턴 적용 전
    /*
    private int ticket = 1000;

    public int getNextTicketNumber(){
        return ticket++;
    }
     */

    //Singleton 패턴 적용 후
    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();


    private TicketMaker(){
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
