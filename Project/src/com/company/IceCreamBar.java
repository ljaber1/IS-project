package com.company;

public class IceCreamBar implements IceCream {
    private String flavor;
    private String cookie;
    public IceCreamBar(){
        flavor = "none";
        cookie = "none";
    }
    public IceCreamBar(String newFlavor, String cookieChoice){
        flavor = newFlavor;
        cookie = cookieChoice;
    }
    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }

    public void setCookie(String cookieChoice) {
        cookie = cookieChoice;
    }

    public String getCookie() {
        return cookie;
    }

    public String getFlavor(){
        return flavor;
    }

}
