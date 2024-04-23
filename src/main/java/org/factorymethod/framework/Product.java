package org.factorymethod.framework;

// 제품을 표현한 클래스
// 추상메소드 use() 만 선언 되어 있음 구체적인 구현은 모두 Product 하위 클래스에 맡기고 있음
public abstract class Product {

    //추상메소드 use
    public abstract void use();
}
