package com.dataJpa.springboot.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dataJpa.springboot.entity.Course;
import com.dataJpa.springboot.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;


    @Test
    public void saveCourseMaterail(){
        Course course = Course.builder()
                    .credit(60)
                    .title("DSA")
                    .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("goole.com")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterial(){
        List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();
        System.out.println(courseMaterials);
    }


}
