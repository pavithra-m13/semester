package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.logrepo;

@Service
public class logservice {
 @Autowired
 private logrepo repo;

 public void saveuser(String name, int age, int salary){
    User u= new User();
    u.setName(name);
    u.setAge(age);
    u.setSalary(salary);
    repo.save(u);
 }
    public User log(String name, int age, int salary){
        User u= repo.findByNameAndAgeAndSalary(name,age,salary);
        return u;
    }

}
