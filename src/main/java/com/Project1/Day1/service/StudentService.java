package com.Project1.Day1.service;


import com.Project1.Day1.Repository.StudentRepo;
import com.Project1.Day1.entity.Student;
import com.Project1.Day1.exception.ResourceNotFoundException;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private  StudentRepo studentRepo ;

    public  ResponseEntity<Student> updateStudents(Long id, Student student) {
       Student student1 =   studentRepo.findById(id).orElseThrow(()-> new RuntimeException("Id invalid / not found"));
       student1.setName(student.getName());
       student1.setEmail(student.getEmail());
       student1.setAge(student.getAge());
       student1.setClassName(student.getClassName());
       studentRepo.save(student1);
       return ResponseEntity.ok(student1);
    }

    public Student save(Student student){
       return studentRepo.save(student);
    }

    public ResponseEntity<List<Student>> getAll() {
        List<Student> all = studentRepo.findAll();
        return ResponseEntity.ok(all);

    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Student Id Invalid"));
    }

    public  String deleteById(Long id) {
        Student studentIdNotFound = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student Id not found"));
        if(studentIdNotFound != null){
            studentRepo.deleteById(id);
        }
        return "Student Deleted Successfully";
    }
    public String deleteAllStudent(){
        studentRepo.deleteAll();
        return "All Student Delete Successfully";
    }
}
