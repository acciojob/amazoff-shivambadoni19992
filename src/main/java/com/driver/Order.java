package com.driver;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
        this.deliveryTime = convert(deliveryTime);

    }
    public int convert(String deliveryTime)
    {
        String[] arr = deliveryTime.split(":");
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);

        return (hr*60) + min;
    }

}
