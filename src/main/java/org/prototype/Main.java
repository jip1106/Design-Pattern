package org.prototype;

import org.prototype.framework.Manager;
import org.prototype.framework.Product;

//문자열을 테두리로 감싸서 표시하거나, 밑줄을 그어 표시하는 예제 Prototype 패턴 사용
public class Main {
    public static void main(String[] args) {
        //준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //등록
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //생성과 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
