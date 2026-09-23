package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.model.Session;
import com.student.util.DBConnection;

public class SessionDAO {

    public void scheduleSession(Session session) {

        String sql = "INSERT INTO session "
                   + "(request_id, session_date, session_time, mode, status) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, session.getRequestId());
            ps.setDate(2, session.getSessionDate());
            ps.setTime(3, session.getSessionTime());
            ps.setString(4, session.getMode());
            ps.setString(5, session.getStatus());

            ps.executeUpdate();

            System.out.println("Session Scheduled Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void getSessionsByRequestId(int requestId) {

        String sql = "SELECT * FROM session WHERE request_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, requestId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                    rs.getInt("session_id") + " | " +
                    rs.getInt("request_id") + " | " +
                    rs.getDate("session_date") + " | " +
                    rs.getTime("session_time") + " | " +
                    rs.getString("mode") + " | " +
                    rs.getString("status")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    
    
    public void updateSessionStatus(int sessionId, String status) {

        String sql = "UPDATE session SET status = ? WHERE session_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, sessionId);

            ps.executeUpdate();

            System.out.println("Session Status Updated Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}