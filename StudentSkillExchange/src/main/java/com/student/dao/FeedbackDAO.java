package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.model.Feedback;
import com.student.util.DBConnection;

public class FeedbackDAO {

    // Add Feedback
    public void addFeedback(Feedback feedback) {

        String sql = "INSERT INTO feedback "
                   + "(session_id, student_id, rating, comment) "
                   + "VALUES (?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, feedback.getSessionId());
            ps.setInt(2, feedback.getStudentId());
            ps.setInt(3, feedback.getRating());
            ps.setString(4, feedback.getComment());

            ps.executeUpdate();

            System.out.println("Feedback Added Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // Get Feedback By Session ID
    public void getFeedbackBySessionId(int sessionId) {

        String sql = "SELECT * FROM feedback WHERE session_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, sessionId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                    rs.getInt("feedback_id") + " | " +
                    rs.getInt("session_id") + " | " +
                    rs.getInt("student_id") + " | " +
                    rs.getInt("rating") + " | " +
                    rs.getString("comment")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}