package com.company;

public class IceCreamCone implements IceCream{
    private String flavor;
    private String cone;
    private String topping;
    public IceCreamCone(){
        flavor = "none";
        cone = "none";
        topping = "none";
    }
    public IceCreamCone(String coneType, String newFlavor, String toppingChoice){
        flavor = newFlavor;
        cone = coneType;
        topping = toppingChoice;

    }

    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }
    public void setCone(String coneType){
        cone = coneType;
    }
    public void setTopping(String toppingChoice){
        topping = toppingChoice;
    }
    public String getFlavor(){
        return flavor;
    }
    public String getCone(){
        return cone;
    }
    public String getTopping() {
        return topping;
    }

}
