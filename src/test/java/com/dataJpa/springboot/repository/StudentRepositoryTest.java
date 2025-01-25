package com.dataJpa.springboot.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dataJpa.springboot.entity.Guardian;
import com.dataJpa.springboot.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emialId("Test@gmail.com")
                .firstName("Rahul")
                .lastName("Gupta")
              //  .guradianName("daddy")
              //  .guradianMobile("8765432109")
              //  .guratdianEmail("test@gmail.com")
                .build();
            studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                    .email("shivaDaddy@daddy.com")
                    .name("shiv")
                    .mobile("8765434567")
                    .build();
        Student student = Student.builder()
                .firstName("Shiva")
                .emialId("shiva@shiv.com")
                .lastName("saiva")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("Student list "+ studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Rahul");
        System.out.println(students);
    }

}
