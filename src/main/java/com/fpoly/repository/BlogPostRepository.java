package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer>{

}
