package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
