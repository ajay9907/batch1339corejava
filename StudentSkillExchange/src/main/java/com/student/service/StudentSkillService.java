package com.student.service;

import com.student.dao.StudentSkillDAO;
import com.student.model.StudentSkill;

public class StudentSkillService {

    private StudentSkillDAO studentSkillDAO = new StudentSkillDAO();

    // Add Student Skill
    public void addStudentSkill(StudentSkill studentSkill) {

        studentSkillDAO.addStudentSkill(studentSkill);
    }

    // Get Skills By Student ID
    public void getSkillsByStudentId(int studentId) {

        studentSkillDAO.getSkillsByStudentId(studentId);
    }

    // Delete Student Skill
    public void deleteStudentSkill(int studentSkillId) {

        studentSkillDAO.deleteStudentSkill(studentSkillId);
    }
}