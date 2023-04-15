package com.company.MediatorPattern;

//创建中介类
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new java.util.Date().toString()
                + " [" + user.getName() + "] : " + message);
    }

}
