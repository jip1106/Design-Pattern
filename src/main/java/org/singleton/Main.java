package org.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println("instance = " + instance);
        System.out.println("instance1 = " + instance1);


        if(instance == instance1){
            System.out.println("같은 인스턴스");
        }else{
            System.out.println("다른 인스턴스");
        }
        System.out.println("End");
    }
}
