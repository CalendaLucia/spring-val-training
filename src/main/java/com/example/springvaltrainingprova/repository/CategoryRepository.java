package com.example.springvaltrainingprova.repository;

import com.example.springvaltrainingprova.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
