package com.itrex.structural.composite;

import com.itrex.structural.composite.furniture.Chair;
import com.itrex.structural.composite.furniture.Furniture;
import com.itrex.structural.composite.furniture.Table;

public class Runner {

    public static void main(String[] args) {

        Table table = new Table();
        Chair chair = new Chair();
        Food food = new Food();
        System.out.printf("Cost product: table - %d, chair - %d, food - %d\n", table.getCost(), chair.getCost(), food.getCost());

        Furniture furniture = new Furniture();
        furniture.add(table);
        furniture.add(chair);
        furniture.add(food);

        System.out.println("Total: " + furniture.getCost());
    }

}
