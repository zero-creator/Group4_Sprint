package com.OnlineMobileStore.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Category_Model")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private List<MobileModel> mobileList=new ArrayList<>();

    public CategoryModel() {
    }

    public CategoryModel(int categoryId, String categoryName, List<MobileModel> mobileList) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.mobileList = mobileList;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<MobileModel> getMobileList() {
        return mobileList;
    }

    public void setMobileList(List<MobileModel> mobileList) {
        this.mobileList = mobileList;
    }
}