package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    // Định nghĩa truy vấn tìm sản phẩm bằng tên
    @Query("SELECT p FROM Product p WHERE p.Name LIKE %:name%")
    List<Product> findProductsByName(@Param("name") String name);
    
    @Query("SELECT p FROM Product p WHERE p.category.IdCategory = ?1")
	List<Product> checkEmtyCategories(int id);
}
