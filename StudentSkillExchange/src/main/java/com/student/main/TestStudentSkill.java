package com.student.main;

import com.student.dao.StudentSkillDAO;

public class TestStudentSkill {

	public static void main(String[] args) {

		StudentSkillDAO dao = new StudentSkillDAO();

		// Rahul = Student ID 1
		dao.getSkillsByStudentId(1);

		dao.deleteStudentSkill(9);
	}

}
