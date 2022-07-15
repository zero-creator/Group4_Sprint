package com.OnlineMobileStore.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart_Model")
public class CartModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Fk")
    private UserModel user;//Foreign key
    private int totalCost;

    @OneToMany(mappedBy = "cart")
    private List<cartItemsModel> cartItemL=new ArrayList<>();

    public CartModel() {
    }

    public CartModel(int cartId, UserModel user, int totalCost, List<cartItemsModel> cartItemL) {
        this.cartId = cartId;
        this.user = user;
        this.totalCost = totalCost;
        this.cartItemL = cartItemL;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public List<cartItemsModel> getCartItemL() {
        return cartItemL;
    }

    public void setCartItemL(List<cartItemsModel> cartItemL) {
        this.cartItemL = cartItemL;
    }
}