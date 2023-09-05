package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.FavoriteProduct;


public interface FavoriteProductRepository extends JpaRepository<FavoriteProduct, Integer>{

}
