package com.Project1.Day1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotBlank(message = "Name cannot be empty")
    private String name ;
    @Email(message = "Invalid email format")
    private String email;
    @Min(value = 12,message = "Age must be at least 12")
    private int age ;
    @NotBlank(message = "Class cannot be empty")
    private String className;
}
