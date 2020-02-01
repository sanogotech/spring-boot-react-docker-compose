package com.macrosoft.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoft.myproject.entity.Course;
import com.macrosoft.myproject.entity.CourseKey;

public interface CourseRepository  extends JpaRepository< Course, CourseKey>{

}
