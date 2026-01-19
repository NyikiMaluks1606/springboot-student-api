package com.hinyikiwile.week1_api.controller;

import com.hinyikiwile.week1_api.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class HelloController {

    private List<Student> students  = new ArrayList<>();

    public HelloController() {
        students.add(new Student(1, "Alex", 21));
        students.add(new Student(2, "Sam", 22));
    }

    // GET all students
    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    // Post new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
