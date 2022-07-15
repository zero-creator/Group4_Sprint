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


    public OrderItemModel() {
    }

    public OrderItemModel(int id, OrderModel order, MobileModel mobile, int quantity, int totalCost, LocalDate dataOfOrder, List<OrderModel> orderL) {
        Id = id;
        this.order = order;
        this.mobile = mobile;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.dataOfOrder = dataOfOrder;
        this.orderL = orderL;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public OrderModel getOrder() {
        return order;
    }

    public void setOrder(OrderModel order) {
        this.order = order;
    }

    public MobileModel getMobile() {
        return mobile;
    }

    public void setMobile(MobileModel mobile) {
        this.mobile = mobile;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getDataOfOrder() {
        return dataOfOrder;
    }

    public void setDataOfOrder(LocalDate dataOfOrder) {
        this.dataOfOrder = dataOfOrder;
    }

    public List<OrderModel> getOrderL() {
        return orderL;
    }

    public void setOrderL(List<OrderModel> orderL) {
        this.orderL = orderL;
    }
}

}

