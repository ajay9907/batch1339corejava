package com.student.model;

public class StudentSkill {

    private int studentSkillId;
    private int studentId;
    private int skillId;
    private String skillType;
	public int getStudentSkillId() {
		return studentSkillId;
	}
	public void setStudentSkillId(int studentSkillId) {
		this.studentSkillId = studentSkillId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

}