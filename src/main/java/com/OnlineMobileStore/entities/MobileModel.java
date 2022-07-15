package com.OnlineMobileStore.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Mobile_Model")
public class MobileModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mobileId;

    private String mobileName;

    private float mobileCost;

    private LocalDate mfd;

    private String modelNumber;

    private String companyName;

    @ManyToOne
    @JoinColumn(name = "category_fk")

    private CategoryModel category; //Foreign key

    public MobileModel() {
    }

    public MobileModel(String mobileName, float mobileCost, LocalDate mfd, String modelNumber, String companyName, CategoryModel category) {
        this.mobileName = mobileName;
        this.mobileCost = mobileCost;
        this.mfd = mfd;
        this.modelNumber = modelNumber;
        this.companyName = companyName;
        this.category = category;
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public float getMobileCost() {
        return mobileCost;
    }

    public void setMobileCost(float mobileCost) {
        this.mobileCost = mobileCost;
    }

    public LocalDate getMfd() {
        return mfd;
    }

    public void setMfd(LocalDate mfd) {
        this.mfd = mfd;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }
}