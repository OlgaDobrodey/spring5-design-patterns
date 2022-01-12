package com.itrex.chapter2.abstractFactory;

import com.itrex.chapter2.abstractFactory.HeathyFood.HealthyFood;
import com.itrex.chapter2.abstractFactory.TastyFood.TastyFood;

public interface AbstractFood {

    HealthyFood getHealthyFood();
    TastyFood getTastyFood();

}
