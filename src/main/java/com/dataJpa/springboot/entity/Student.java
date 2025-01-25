package com.dataJpa.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "student",
      uniqueConstraints = @UniqueConstraint(
        name = "emailid_unique",
        columnNames = "emialId"
      )
)
public class Student {

    @Id
    @SequenceGenerator(
        name = "Student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "emailId",nullable = false)
    private String emialId;
    

    @Embedded
    private Guardian guardian;
    
}
