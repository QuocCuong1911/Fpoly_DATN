package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer>{

}
