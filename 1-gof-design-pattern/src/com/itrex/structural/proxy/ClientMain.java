package com.itrex.chapter3.proxy;

import com.itrex.chapter3.decorate.Product;

public class ClientMain {

    public static void main(String[] args) {

        Product proxyShampooStory = new ProxyShampooStory();
        proxyShampooStory.getPrice();
        proxyShampooStory.getTitle();

    }

}
