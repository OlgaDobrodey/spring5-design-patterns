package com.itrex.structural.decorate;

public class NatureDecorate implements Product{

    private Product product;
    private Integer priceNature;


    public NatureDecorate(Product product) {
        this.product = product;
        this.priceNature = product.getPrice()*2;
    }

    @Override
    public Integer getPrice() {
        System.out.printf("Total price %d consisted two part: cream - %d, nature part - %d\n", priceNature,product.getPrice(),priceNature-product.getPrice());
        return priceNature;
    }

    @Override
    public void getTitle() {
        System.out.print(this.getClass().getSimpleName()+" ");
        product.getTitle();
    }

}
