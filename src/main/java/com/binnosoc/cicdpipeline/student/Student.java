package com.binnosoc.cicdpipeline.student;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "student")
@Data
public class Student {

  @Id
  @GeneratedValue
  private Integer id;

  private String firstname;

  private String lastname;

  private LocalDate dateOfBirth;

  @Column(unique = true)
  private String email;

  @Transient
  private int age;

}
