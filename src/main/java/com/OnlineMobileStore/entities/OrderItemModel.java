package com.OnlineMobileStore.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private LocalDate dataOfOrder;

    @OneToMany(mappedBy = "user")
    private List<OrderModel> orderL=new ArrayList<>();
}
