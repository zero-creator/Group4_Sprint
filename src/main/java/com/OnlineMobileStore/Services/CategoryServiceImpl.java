package com.OnlineMobileStore.Services;

import com.OnlineMobileStore.entities.CategoryModel;
import com.OnlineMobileStore.Repositories.CategoryRepository;
import com.OnlineMobileStore.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;









    @Service
    public class CategoryServiceImpl implements CategoryService {

        @Autowired
        private CategoryRepository categoryRepository;

        @Override
        public CategoryModel addCategory(CategoryModel category) {
            return this.categoryRepository.save(category);
        }

        @Override
        public CategoryModel updateCategory(CategoryModel category) {
            return this.categoryRepository.save(category);
        }

        @Override
        public Set<CategoryModel> getCategories() {
            return new LinkedHashSet<>(this.categoryRepository.findAll());
        }

        @Override
        public CategoryModel getCategory(Integer categoryId) {
            return null;
        }


//        @Override
//        public void delete(Integer categoryId) {
//
//        }

        @Override
        public void delete(Integer categoryId) {
            this.categoryRepository.deleteById(categoryId);
        }
    }

