package org.factorymethod;

import org.factorymethod.framework.Factory;
import org.factorymethod.framework.Product;
import org.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory fc = new IDCardFactory();
        Product junIl = fc.create("JunIl");
        Product yunMi = fc.create("YunMi");
        Product jaeHak = fc.create("JaeHak");

        junIl.use();
        yunMi.use();
        jaeHak.use();
    }
}
