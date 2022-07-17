package com.OnlineMobileStore.Services;

import java.util.Set;

import com.OnlineMobileStore.entities.CategoryModel;


public interface CategoryService {




            public CategoryModel addCategory(CategoryModel categoryModel);
            public CategoryModel updateCategory(CategoryModel categoryModel);
            public Set<CategoryModel> getCategories();
            public CategoryModel getCategory(Integer categoryId);
            public void delete(Integer categoryId);
        }

