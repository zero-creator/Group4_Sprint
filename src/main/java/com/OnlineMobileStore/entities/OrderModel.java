package com.OnlineMobileStore.entities;

import javax.persistence.*;

@Entity
@Table(name = "Order_Model")
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    @ManyToOne
    @JoinColumn(name = "user_Fk")
    private UserModel user;//Foreign key
    private int TotalCost;

}
