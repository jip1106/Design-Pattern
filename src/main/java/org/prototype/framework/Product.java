package org.prototype.framework;

public interface Product extends Cloneable{
    public abstract void use(String s);
    Product createCopy();
}
