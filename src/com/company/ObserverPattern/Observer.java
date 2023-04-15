package com.company.ObserverPattern;


//创建 Observer 类。
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}


