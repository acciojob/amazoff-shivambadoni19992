package com.driver;

public class Order
{
    private String id;
    private int deliveryTime;

    public Order()
    {

    }
    public Order(String id, String deliveryTime)
    {
        this.id = id;
        String[] arr = deliveryTime.split(":");
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        this.deliveryTime = (hr*60) + min;;

    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
