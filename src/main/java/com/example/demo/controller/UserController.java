package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : demo
 * @date : 5/31/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUser();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userID}")
    public UserDTO getUserByUserID(@PathVariable String userID){
        return userService.getUserDetailById(userID);
    }

    @GetMapping("/getUserByUserIdAndUserAddress/{userID}/{address}")
    public UserDTO getUserByUserIdAndUserAddress(@PathVariable String userID, @PathVariable String address){
        return userService.getUserByUserIdAndUserAddress(userID, address);
    }
}
