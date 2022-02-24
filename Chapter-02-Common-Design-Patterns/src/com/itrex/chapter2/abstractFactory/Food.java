package com.itrex.chapter2.abstractFactory;

import com.itrex.chapter2.abstractFactory.HeathyFood.HealthyFood;
import com.itrex.chapter2.abstractFactory.HeathyFood.Salad;
import com.itrex.chapter2.abstractFactory.TastyFood.Pizza;
import com.itrex.chapter2.abstractFactory.TastyFood.TastyFood;

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
