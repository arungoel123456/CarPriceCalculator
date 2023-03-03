package com.demo.decorators;

import com.demo.base.*;

public class Covers extends Decorator {

    public Covers(Base car) {
        super(car);
    }

    @Override
    public int cost() {
        return car.cost() + 20000 ;
    }
}
