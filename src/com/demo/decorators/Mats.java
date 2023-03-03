package com.demo.decorators;

import com.demo.base.*;

public class Mats extends Decorator {
    public Mats(Base car) {
        super(car);
    }

    @Override
    public int cost() {
        return car.cost() + 10000 ;
    }
}
