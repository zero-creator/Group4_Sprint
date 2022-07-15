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

    public UserModel() {
    }

    public UserModel(int userID, String userName, String userPassword, Long mobileNumber, String email_id, String userRole, List<OrderModel> orderL, CartModel care) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
        this.mobileNumber = mobileNumber;
        this.email_id = email_id;
        this.userRole = userRole;
        this.orderL = orderL;
        this.care = care;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public List<OrderModel> getOrderL() {
        return orderL;
    }

    public void setOrderL(List<OrderModel> orderL) {
        this.orderL = orderL;
    }

    public CartModel getCare() {
        return care;
    }

    public void setCare(CartModel care) {
        this.care = care;
    }
}