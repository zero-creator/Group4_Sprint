package com.OnlineMobileStore.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Cart_Items_Model")
public class cartItemsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "cart_fk")
    private CartModel cart;//Foreign key

    @OneToOne
    @JoinColumn(name = "mobile_fk")
    private MobileModel mobile;//Foreign key

    private int quantity;
    private int totalCost;

    public cartItemsModel() {
    }

    public cartItemsModel(int id, CartModel cart, MobileModel mobile, int quantity, int totalCost) {
        Id = id;
        this.cart = cart;
        this.mobile = mobile;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public CartModel getCart() {
        return cart;
    }

    public void setCart(CartModel cart) {
        this.cart = cart;
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
}