package org.abstractfactory.listfactory;

import org.abstractfactory.factory.Factory;
import org.abstractfactory.factory.Link;
import org.abstractfactory.factory.Page;
import org.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
