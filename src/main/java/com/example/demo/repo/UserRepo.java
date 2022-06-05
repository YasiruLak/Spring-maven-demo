package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Yasiru Dahanayaka
 * @name : demo
 * @date : 5/31/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM User WHERE ID = ?1", nativeQuery = true)
    User getUserByUserId(String userId);

    @Query(value = "SELECT * FROM User WHERE ID = ?1 AND address = ?2", nativeQuery = true)
    User getUserByUserIdAndUserAddress(String userId, String address);
}
