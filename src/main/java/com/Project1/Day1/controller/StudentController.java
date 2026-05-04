package com.Project1.Day1.controller;


import com.Project1.Day1.entity.Student;
import com.Project1.Day1.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.LongBuffer;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService ;

    @PostMapping
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){
        return ResponseEntity.ok(studentService.save(student));
    }
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent(){
        return studentService.getAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id , @RequestBody Student student){
        return studentService.updateStudents(id , student);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
       return ResponseEntity.ok(studentService.getStudentById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.deleteById(id));
    }
    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllStudent(){
        studentService.deleteAllStudent();
        return ResponseEntity.noContent().build();
    }
}
