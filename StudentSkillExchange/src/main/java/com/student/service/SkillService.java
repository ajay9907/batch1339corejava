package com.student.service;

import com.student.dao.SkillDAO;
import com.student.model.Skill;

public class SkillService {

    private SkillDAO skillDAO = new SkillDAO();

    // Add Skill
    public void addSkill(Skill skill) {

        skillDAO.addSkill(skill);
    }

    // Get All Skills
    public void getAllSkills() {

        skillDAO.getAllSkills();
    }

    // Get Skill By ID
    public Skill getSkillById(int skillId) {

        return skillDAO.getSkillById(skillId);
    }

    // Update Skill
    public void updateSkill(Skill skill) {

        skillDAO.updateSkill(skill);
    }

    // Delete Skill
    public void deleteSkill(int skillId) {

        skillDAO.deleteSkill(skillId);
    }
}