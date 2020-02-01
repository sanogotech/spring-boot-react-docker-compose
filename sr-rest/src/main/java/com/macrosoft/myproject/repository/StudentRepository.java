package com.macrosoft.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoft.myproject.entity.Student;

public interface StudentRepository  extends JpaRepository< Student, String> {

}
