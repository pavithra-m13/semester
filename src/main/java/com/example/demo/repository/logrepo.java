package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;
import java.util.List;

@Repository
public interface logrepo extends JpaRepository<User, String>{
    User findByNameAndAgeAndSalary(String name, int age, int salary);
}
