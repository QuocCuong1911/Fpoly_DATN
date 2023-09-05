package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
