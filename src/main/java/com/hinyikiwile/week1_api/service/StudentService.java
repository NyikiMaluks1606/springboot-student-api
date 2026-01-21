package com.hinyikiwile.week1_api.service;

import com.hinyikiwile.week1_api.model.Student;
import com.hinyikiwile.week1_api.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Optional<Student> getStudentById(int id){
        return repository.findById(id);
    }

    public Student saveStudent(Student student){
        return repository.save(student);
    }
}
