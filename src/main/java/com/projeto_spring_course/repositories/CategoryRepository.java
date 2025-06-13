package com.projeto_spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_spring_course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
