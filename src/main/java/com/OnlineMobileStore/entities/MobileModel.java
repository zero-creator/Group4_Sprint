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
}
