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

    public OrderModel() {
    }

    public OrderModel(int orderId, UserModel user, int totalCost) {
        this.orderId = orderId;
        this.user = user;
        TotalCost = totalCost;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public int getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(int totalCost) {
        TotalCost = totalCost;
    }
}