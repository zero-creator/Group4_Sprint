package com.OnlineMobileStore.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.crypto.Data;

public class OrderItemModel {
    private int Id;
    @ManyToOne
    @JoinColumn(name = "order_fk")
    private OrderModel order;//Foreign key
    @OneToOne
    @JoinColumn(name = "mobile_fk")
    private MobileModel mobile;//Foreign key
    private int quantity;
    private int totalCost;
    private Data dataOfOrder;
}
