package com.fitness.backend.Repository;

import com.fitness.backend.Model.Student;
import com.fitness.backend.Repository.StudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}