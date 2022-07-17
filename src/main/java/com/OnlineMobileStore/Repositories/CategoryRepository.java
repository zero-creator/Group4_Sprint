package com.OnlineMobileStore.Repositories;

import org.springframework.data.jpa.Repositories.JpaRepository;
import com.OnlineMobileStore.entities.CategoryModel;



      public interface CategoryRepository extends JpaRepository<CategoryModel,Integer> {

    }



