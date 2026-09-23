package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.util.DBConnection;

public class MatchingDAO {

    public void findMatches(int studentId) {

        String sql =
                "SELECT DISTINCT " +
                "s1.student_id AS student1_id, " +
                "s1.name AS student1_name, " +
                "sk1.skill_name AS teach_skill, " +
                "s2.student_id AS student2_id, " +
                "s2.name AS student2_name " +
                "FROM student_skill ss1 " +
                "JOIN student s1 ON ss1.student_id = s1.student_id " +
                "JOIN skill sk1 ON ss1.skill_id = sk1.skill_id " +
                "JOIN student_skill ss2 ON ss2.skill_id = ss1.skill_id " +
                "JOIN student s2 ON ss2.student_id = s2.student_id " +
                "WHERE ss1.skill_type = 'TEACH' " +
                "AND ss2.skill_type = 'LEARN' " +
                "AND ss2.student_id = ? " +
                "AND ss1.student_id != ss2.student_id";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                    rs.getString("student1_name")
                    + " teaches "
                    + rs.getString("teach_skill")
                    + " to "
                    + rs.getString("student2_name")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}