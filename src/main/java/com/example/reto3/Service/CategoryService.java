package com.example.reto3.Service;

import com.example.reto3.Repository.CategoryRepository;
import com.example.reto3.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
    public Optional<Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }

    public Category save(Category category){
        if (category.getId() == null) {
            return categoryRepository.save(category);
        }else {
            Optional<Category> category1 = categoryRepository.getCategory(category.getId());
            if (category1.isEmpty()) {
                return categoryRepository.save(category);
            }else {
                return  category;
            }
        }
    }
}
