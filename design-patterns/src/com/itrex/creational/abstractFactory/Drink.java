package com.itrex.creational.abstractFactory;

import com.itrex.creational.abstractFactory.HeathyFood.HealthyFood;
import com.itrex.creational.abstractFactory.HeathyFood.OrangeJuice;
import com.itrex.creational.abstractFactory.TastyFood.Cola;
import com.itrex.creational.abstractFactory.TastyFood.TastyFood;

public class Drink implements AbstractFood {

    @Override
    public HealthyFood getHealthyFood() {
        return new OrangeJuice();
    }

    @Override
    public TastyFood getTastyFood() {
        return new Cola();
    }

}
