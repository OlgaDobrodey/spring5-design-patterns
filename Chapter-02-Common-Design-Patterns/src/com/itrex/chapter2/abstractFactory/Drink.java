package com.itrex.chapter2.abstractFactory;

import com.itrex.chapter2.abstractFactory.HeathyFood.HealthyFood;
import com.itrex.chapter2.abstractFactory.HeathyFood.OrangeJuice;
import com.itrex.chapter2.abstractFactory.TastyFood.Cola;
import com.itrex.chapter2.abstractFactory.TastyFood.TastyFood;

public class Drink implements AbstractFood{

    @Override
    public HealthyFood getHealthyFood() {
        return new OrangeJuice();
    }

    @Override
    public TastyFood getTastyFood() {
        return new Cola();
    }

}
