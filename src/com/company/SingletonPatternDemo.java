package com.company;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Illegal construct
        // Compile Time Error: The constructor Singleton() is not visible
        // Singleton object = new Singleton();

        // Get the only object available
        Singleton object = Singleton.getInstance();
        System.out.println("object = " + object);

        // Show the message
        object.showMessage();
    }
}
