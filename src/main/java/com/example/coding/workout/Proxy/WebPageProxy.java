package com.example.coding.workout.Proxy;

public class WebPageProxy implements WebPage {
    private WebPage webpage;

    public WebPageProxy(){
        webpage= new WebPageImpl();
    }
    @Override
    public void renderPage(String url) throws Exception {
        if(url.equalsIgnoreCase("www.facebook.com")){
            throw new Exception(url+" is bocked by ISP.");
        }
        else{
            webpage.renderPage(url);
        }
    }
}
