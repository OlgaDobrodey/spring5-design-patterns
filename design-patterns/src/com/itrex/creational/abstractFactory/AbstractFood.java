package com.itrex.creational.abstractFactory;

import com.itrex.creational.abstractFactory.HeathyFood.HealthyFood;
import com.itrex.creational.abstractFactory.TastyFood.TastyFood;

public interface AbstractFood {

    HealthyFood getHealthyFood();

    TastyFood getTastyFood();

}
