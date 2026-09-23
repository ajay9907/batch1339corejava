package com.student.main;

import com.student.dao.SkillDAO;

public class TestSkill {

    public static void main(String[] args) {

        SkillDAO dao = new SkillDAO();

        dao.deleteSkill(14);
    }
}