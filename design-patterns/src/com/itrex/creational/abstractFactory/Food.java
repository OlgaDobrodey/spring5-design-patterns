package com.itrex.creational.abstractFactory;

import com.itrex.creational.abstractFactory.HeathyFood.HealthyFood;
import com.itrex.creational.abstractFactory.HeathyFood.Salad;
import com.itrex.creational.abstractFactory.TastyFood.Pizza;
import com.itrex.creational.abstractFactory.TastyFood.TastyFood;

public class Food implements AbstractFood {

    @Override
    public HealthyFood getHealthyFood() {
        return new Salad();
    }

    @Override
    public TastyFood getTastyFood() {
        return new Pizza();
    }

}
