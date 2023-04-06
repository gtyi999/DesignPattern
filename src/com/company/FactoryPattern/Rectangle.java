package com.company.FactoryPattern;

public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("Inside Rectangle::Rectangle() method.");
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    public void draw(int x, int y) {
        System.out.println("Inside Rectangle::draw(int x, int y) method.");
    }
}
