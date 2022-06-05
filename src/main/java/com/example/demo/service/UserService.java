package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : demo
 * @date : 5/31/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUser(){
        List<User>userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<User>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }

    //user id > user details
    //SELECT * FROM User WHERE id =?;

    public UserDTO getUserDetailById(String id){
        User user = userRepo.getUserByUserId(id);
        return modelMapper.map(user, UserDTO.class);
    }

    //user id, address > user details
    //SELECT * FROM User WHERE id = ? and address = ?;

    public UserDTO getUserByUserIdAndUserAddress(String id, String address){
        User user = userRepo.getUserByUserIdAndUserAddress(id, address);
        return modelMapper.map(user, UserDTO.class);
    }

}
