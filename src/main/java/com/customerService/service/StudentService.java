package com.customerService.service;

import com.customerService.model.Student;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);

    Student getStudentById(Long studentId);

    List<Student> getStudentsByFirstName(String firstName);
}
