package com.example.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	
}