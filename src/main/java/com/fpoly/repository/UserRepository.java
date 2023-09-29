package com.fpoly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpoly.entity.User;
public interface UserRepository extends JpaRepository<User, Integer>{

}
