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
}
