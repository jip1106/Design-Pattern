package org.factorymethod.framework;

//Template Method 패턴 사용
public abstract class Factory {
    //create 로 Product 인스턴스를 생성하는것
    // => create 가 Template Method 로 되어있음
    public final Product create(String owner){
        
        //createProduct 로 제품을 만들고
        Product p = createProduct(owner);
        
        //registerProduct 로 등록하는 것
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
