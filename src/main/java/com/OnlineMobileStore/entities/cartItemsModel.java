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
}
