package com.macrosoft.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoft.myproject.entity.Enrollment;
import com.macrosoft.myproject.entity.EnrollmentKey;

public interface EnrollmentRepository  extends JpaRepository< Enrollment, EnrollmentKey>{

}
