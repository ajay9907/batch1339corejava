package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.model.StudentSkill;
import com.student.util.DBConnection;

public class StudentSkillDAO {

    public void addStudentSkill(StudentSkill studentSkill) {

        String sql = "INSERT INTO student_skill "
                   + "(student_id, skill_id, skill_type) "
                   + "VALUES (?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, studentSkill.getStudentId());
            ps.setInt(2, studentSkill.getSkillId());
            ps.setString(3, studentSkill.getSkillType());

            ps.executeUpdate();

            System.out.println("Student Skill Added Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    //getting student skills on id 
    
    public void getSkillsByStudentId(int studentId) {

        String sql = "SELECT * FROM student_skill WHERE student_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                    rs.getInt("student_skill_id") + " | " +
                    rs.getInt("student_id") + " | " +
                    rs.getInt("skill_id") + " | " +
                    rs.getString("skill_type")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    //
    public void deleteStudentSkill(int studentSkillId) {

        String sql = "DELETE FROM student_skill WHERE student_skill_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, studentSkillId);

            ps.executeUpdate();

            System.out.println("Student Skill Deleted Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}