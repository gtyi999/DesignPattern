package com.company;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        // Exists only to defeat instantiation.
        System.out.println("Singleton created");
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World!");
    }

}

