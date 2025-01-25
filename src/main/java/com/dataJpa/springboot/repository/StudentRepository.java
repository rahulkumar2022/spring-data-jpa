package com.dataJpa.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataJpa.springboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

    public List<Student> findByFirstName(String firstName);
    
}
