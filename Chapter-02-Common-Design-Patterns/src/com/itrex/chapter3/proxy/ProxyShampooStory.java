package com.itrex.chapter3.proxy;

import com.itrex.chapter3.decorate.Product;
import com.itrex.chapter3.decorate.Shampoo;

public class ProxyShampooStory implements Product {

    private Product shampoo;

    @Override
    public Integer getPrice() {
        if(this.shampoo==null){
            this.shampoo=new Shampoo();
        }
        System.out.println("Shampoo with tax = " + (shampoo.getPrice()*2+1));
        return shampoo.getPrice()*2+1;
    }

    @Override
    public void getTitle() {
        shampoo.getTitle();
        System.out.println("added in story");

    }

}
