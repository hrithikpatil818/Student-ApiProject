package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
