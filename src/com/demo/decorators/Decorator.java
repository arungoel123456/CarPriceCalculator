package com.demo.decorators;

import com.demo.base.*;

public abstract class Decorator extends Base{
    protected Base car;

    public Decorator(Base car) {
        this.car = car;
    }
}
