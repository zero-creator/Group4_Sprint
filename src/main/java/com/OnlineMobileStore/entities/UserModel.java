package com.OnlineMobileStore.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User_Model")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String userName;
    private String userPassword;
    private Long mobileNumber;
    private String email_id;
    private String userRole;

    @OneToMany(mappedBy = "user")
    private List<OrderModel> orderL=new ArrayList<>();
    @OneToOne(mappedBy = "user")
    private CartModel care;
}
