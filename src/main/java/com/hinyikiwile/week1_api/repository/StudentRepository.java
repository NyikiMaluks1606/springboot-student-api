package com.hinyikiwile.week1_api.repository;

import com.hinyikiwile.week1_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
