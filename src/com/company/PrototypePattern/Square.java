package com.company.PrototypePattern;


//创建扩展了上面抽象类的实体类。
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
