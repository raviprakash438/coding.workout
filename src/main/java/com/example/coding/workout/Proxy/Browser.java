package com.example.coding.workout.Proxy;

public class Browser {
   private static WebPageProxy webPageProxy = new WebPageProxy();

    public static void main(String[] args) throws Exception {
        webPageProxy.renderPage("www.Instagram.com");
    }
}
