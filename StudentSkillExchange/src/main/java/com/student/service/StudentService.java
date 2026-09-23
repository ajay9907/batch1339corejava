package com.student.service;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class StudentService {

    private StudentDAO studentDAO = new StudentDAO();

    // Register Student
    public void registerStudent(Student student) {

        studentDAO.registerStudent(student);
    }

    // Login Student
    public Student loginStudent(String email, String password) {

        return studentDAO.loginStudent(email, password);
    }

    // Get Student By ID
    public Student getStudentById(int studentId) {

        return studentDAO.getStudentById(studentId);
    }

    // Update Student Profile
    public void updateStudent(Student student) {

        studentDAO.updateStudent(student);
    }
}