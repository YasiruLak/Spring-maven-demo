package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getUser")
    public String getUser(){
        return "Simple-root";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "Save User";
    }



}
