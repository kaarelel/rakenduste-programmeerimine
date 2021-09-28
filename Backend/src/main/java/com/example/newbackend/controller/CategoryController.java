package com.example.newbackend.controller;

import com.example.newbackend.model.Category;

import com.example.newbackend.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @GetMapping ("category")
    public List<Category> getCategory() {
        return categoryService.getCategories();
    }

    @PostMapping("category")
    public String postCategory(@RequestBody Category category ) {
        categoryService.saveCategory(category);
        return "Saved " + category.getName();
    }

//    @PatchMapping("items")
//    public String patchItems(@RequestBody Item price, @RequestBody Long id ) {
//        itemService.patchItem(price, id);
//        return "Updated ";
//    }

    @DeleteMapping("category/{id}")
    public String deleteCategory(@PathVariable("id") Long id){
        categoryService.deleteCategory(id);
        return "Removed ";
    }
}