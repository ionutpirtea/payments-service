package com.demo.utils;

public class PaymentResourceJsonDecorator {

    private static String appHostName= "localhost";

    public PaymentResourceJsonDecorator(String hostName) {
        appHostName = hostName;
    }

    public static String hostName(){
        return appHostName;
    }
}
