package com.itrex.chapter3.composite.furniture;

import com.itrex.chapter3.composite.Product;

import java.util.ArrayList;
import java.util.List;

public class Furniture implements Product {

    private List<Product> productList = new ArrayList<>();

    @Override
    public Integer getCost() {
        Integer sum = 0;
        for (Product product : productList) {
            System.out.println(product.getClass().getSimpleName() + " " + product.getCost());
            sum = sum + product.getCost();
        }
        return sum;
    }

    public void add(Product product) {
        productList.add(product);
    }

}
