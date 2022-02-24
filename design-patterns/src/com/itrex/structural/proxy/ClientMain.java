package com.itrex.structural.proxy;

import com.itrex.structural.decorate.Product;

public class ClientMain {

    public static void main(String[] args) {

        Product proxyShampooStory = new ProxyShampooStory();
        proxyShampooStory.getPrice();
        proxyShampooStory.getTitle();

    }

}
