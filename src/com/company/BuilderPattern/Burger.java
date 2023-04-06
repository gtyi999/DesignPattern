package com.company.BuilderPattern;

// This is the abstract class that will be extended by the concrete classes 瓶子
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}
