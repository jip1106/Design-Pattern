package org.factorymethod.idcard;

import org.factorymethod.framework.Factory;
import org.factorymethod.framework.Product;

public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("product :: " + product + "을 등록했습니다. ");
    }
}
