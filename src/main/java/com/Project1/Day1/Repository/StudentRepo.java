package com.Project1.Day1.Repository;

import com.Project1.Day1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Long> {
    Optional<Student> findByName(String name);
}
