package org.templatemethod;

public class Main {
    public static void main(String[] args) {
        CharDisplay cd = new CharDisplay('H');
        StringDisplay sd = new StringDisplay("Hello, World");

        cd.display();
        sd.display();

        System.out.println("\n===============\n");

        //실제 동작은 하위클래스인 CharDisplay , StringDisplay 하위클래스 에서 처리한다.
        AbstractDisplay ad1 = new CharDisplay('H');
        AbstractDisplay ad2 = new StringDisplay("Hello World");

        ad1.display();
        ad2.display();
    }
}
