package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
