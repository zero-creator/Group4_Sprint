package com.OnlineMobileStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.OnlineMobileStore.entities.CategoryModel;
import com.OnlineMobileStore.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

        @Autowired
        private CategoryService categoryService;
        //add category
        @PostMapping("/")
        public ResponseEntity<?> addCategory(@RequestBody CategoryModel category)
        {
            CategoryModel cat1=this.categoryService.addCategory(category);
            return  ResponseEntity.ok(cat1);
        }

        //get single category
        @GetMapping("/{categoryId}")
        public CategoryModel getCategory(@PathVariable("categoryId") Integer categoryId)
        {

            return  this.categoryService.getCategory(categoryId);
        }

        //get all categories
        @GetMapping("/")
        public ResponseEntity<?> getCategories()
        {
            return  ResponseEntity.ok(this.categoryService.getCategories());
        }

        //update any category
        @PutMapping("/")
        public  CategoryModel updateCategory(@RequestBody CategoryModel category)
        {
            return this.categoryService.updateCategory(category);
        }

        //delete Category
        @DeleteMapping("/{catId}")
        public  void  DeleteCategory(@PathVariable("catId") Integer catId)
        {
            this.categoryService.delete(catId);
        }


    }



