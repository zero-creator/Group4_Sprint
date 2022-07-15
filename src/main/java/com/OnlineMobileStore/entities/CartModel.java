package com.OnlineMobileStore.entities;

import javax.persistence.*;

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

}
