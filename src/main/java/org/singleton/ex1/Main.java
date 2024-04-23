package org.singleton.ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        for(int i=0; i<10; i++){
            int ticketNum = TicketMaker.getInstance().getNextTicketNumber();
            System.out.println(i + " :: ticketNum = " + ticketNum);

        }
        System.out.println("End");
    }
}
