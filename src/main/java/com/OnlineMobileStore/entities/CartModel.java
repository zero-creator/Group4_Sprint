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
}
