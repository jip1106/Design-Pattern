package org.abstractfactory.divfactory;

import org.abstractfactory.factory.Factory;
import org.abstractfactory.factory.Link;
import org.abstractfactory.factory.Page;
import org.abstractfactory.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
