package org.prototype.q1a.framework;

//Product 인터페이스를 클래스로 만들고, createCopy 메소드를 구현 (Template Method 패턴)
public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
