package com.customerService.service;

import com.customerService.model.Student;
import com.customerService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void createStudent(Student student) {
        studentRepository.createStudent(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
       return studentRepository.getStudentById(studentId);
    }

    @Override
    public List<Student> getStudentsByFirstName(String firstName) {
       return studentRepository.getStudentsByFirstName(firstName);
    }

//
}
