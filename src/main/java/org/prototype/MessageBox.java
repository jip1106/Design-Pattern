package org.prototype;

import org.prototype.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    private void printDecoChar(String s){
        int decoLen = 1 + s.length() + 1;

        for(int i=0; i< decoLen; i++){
            System.out.print(decochar);
        }

        System.out.println();
    }

    @Override
    public void use(String s) {
        printDecoChar(s);

        System.out.println(decochar+ s + decochar);

        printDecoChar(s);

    }

    @Override
    public Product createCopy() {
        Product p = null;

        try{
            p = (Product)clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return p;
    }
}
