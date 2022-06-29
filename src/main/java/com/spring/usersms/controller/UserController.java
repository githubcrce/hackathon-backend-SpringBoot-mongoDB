package com.spring.usersms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.usersms.model.UserModel;
import com.spring.usersms.repository.UserRepo;
import com.spring.usersms.service.impl.UserServiceImpl;

//Annotation 
@RestController

//Class 
public class UserController {

 @Autowired
 private UserRepo repo;

 @PostMapping("/addUser")
 public String saveUser(@RequestBody UserModel user){
     repo.save(user);
     
     return "Added Successfully";
 }

 @GetMapping("/findAllUser")
 public List<UserModel> getUsers() {
     
     return repo.findAll();
 }
 
 @GetMapping("/findSingleUser/{phone}")
 public UserModel getSingleUser(@PathVariable String phone) {
	 UserServiceImpl userService = new UserServiceImpl();
	 UserModel user = userService.findUserByPhone(phone);
     return user;
 }

 @DeleteMapping("/deleteUser/{id}")
 public String deleteUser(@PathVariable int id){
     repo.deleteById(id);
     
     return "Deleted Successfully";
 }

}
