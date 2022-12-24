package com.driver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class DeliveryPartner {
    
    private String id;
    private int numberOfOrders;
    public DeliveryPartner(String partnerId) {
        this.id=partnerId;
    }

    

}