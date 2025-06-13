package com.projeto_spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_spring_course.entities.Category;
import com.projeto_spring_course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
