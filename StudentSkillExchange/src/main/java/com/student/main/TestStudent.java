package com.student.main;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class TestStudent {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        // Get existing student
        Student student = dao.getStudentById(11);

        if (student != null) {

            // Update student details
            student.setName("Snehal");
            student.setMobile("9999999999");
            student.setCourse("Computer Engineering");
            student.setYear(4);

            // Update in database
            dao.updateStudent(student);

            // Check updated data
            Student updatedStudent = dao.getStudentById(11);

            System.out.println("Updated Student Details");
            System.out.println("Student ID: " + updatedStudent.getStudentId());
            System.out.println("Name: " + updatedStudent.getName());
            System.out.println("Email: " + updatedStudent.getEmail());
            System.out.println("Mobile: " + updatedStudent.getMobile());
            System.out.println("Course: " + updatedStudent.getCourse());
            System.out.println("Year: " + updatedStudent.getYear());

        } else {

            System.out.println("Student Not Found");
        }
    }
}