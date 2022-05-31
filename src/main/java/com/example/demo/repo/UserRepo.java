package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Yasiru Dahanayaka
 * @name : demo
 * @date : 5/31/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
public interface UserRepo extends JpaRepository<User, Integer> {
}
