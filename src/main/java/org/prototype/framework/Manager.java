package org.prototype.framework;

import java.util.HashMap;
import java.util.Map;

//Product 인터페이스를 이용해 인스턴스를 복제하는 클래스
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype){
        showcase.put(name,prototype);
    }

    public Product create(String prototypeName){
        Product p = showcase.get(prototypeName);

        //createCopy 를 호출하지만 구체적으로 어느 클래스의 인스턴스를 복제할지 관여하지 않음
        //Product 인터페이스를 구현한 클래스이기만 하면 해당 인스턴스를 복제할 수 있음
        
        return p.createCopy();
    }
}
