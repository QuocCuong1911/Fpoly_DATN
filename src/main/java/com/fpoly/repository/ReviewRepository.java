package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
