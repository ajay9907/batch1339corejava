package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.model.Skill;
import com.student.util.DBConnection;

public class SkillDAO {

    public void addSkill(Skill skill) {

        String sql = "INSERT INTO skill (skill_name) VALUES (?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, skill.getSkillName());

            ps.executeUpdate();

            System.out.println("Skill Added Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void getAllSkills() {

        String sql = "SELECT * FROM skill";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                    rs.getInt("skill_id") + " | " +
                    rs.getString("skill_name")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public Skill getSkillById(int skillId) {

        String sql = "SELECT * FROM skill WHERE skill_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, skillId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Skill skill = new Skill();

                skill.setSkillId(rs.getInt("skill_id"));
                skill.setSkillName(rs.getString("skill_name"));

                return skill;
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }
    //updating skills 
    
    public void updateSkill(Skill skill) {

        String sql = "UPDATE skill SET skill_name = ? WHERE skill_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, skill.getSkillName());
            ps.setInt(2, skill.getSkillId());

            ps.executeUpdate();

            System.out.println("Skill Updated Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    // for deleting skills 
    
    public void deleteSkill(int skillId) {

        String sql = "DELETE FROM skill WHERE skill_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, skillId);

            ps.executeUpdate();

            System.out.println("Skill Deleted Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}