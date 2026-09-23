package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.model.ExchangeRequest;
import com.student.util.DBConnection;

public class ExchangeRequestDAO {
	public void sendRequest(ExchangeRequest request) {

		String sql = "INSERT INTO exchange_request " + "(sender_id, receiver_id, skill_id, status, request_date) "
				+ "VALUES (?, ?, ?, ?, ?)";

		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, request.getSenderId());
			ps.setInt(2, request.getReceiverId());
			ps.setInt(3, request.getSkillId());
			ps.setString(4, request.getStatus());
			ps.setDate(5, request.getRequestDate());

			ps.executeUpdate();

			System.out.println("Exchange Request Sent Successfully");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public void getRequestsByReceiverId(int receiverId) {

	    String sql = "SELECT * FROM exchange_request WHERE receiver_id = ?";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setInt(1, receiverId);

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {

	            System.out.println(
	                rs.getInt("request_id") + " | " +
	                rs.getInt("sender_id") + " | " +
	                rs.getInt("receiver_id") + " | " +
	                rs.getInt("skill_id") + " | " +
	                rs.getString("status") + " | " +
	                rs.getDate("request_date")
	            );
	        }

	    } catch (Exception e) {

	        e.printStackTrace();
	    }
	}
	
	public void updateRequestStatus(int requestId, String status) {

	    String sql = "UPDATE exchange_request "
	               + "SET status = ? "
	               + "WHERE request_id = ?";

	    try {

	        Connection con = DBConnection.getConnection();

	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setString(1, status);
	        ps.setInt(2, requestId);

	        ps.executeUpdate();

	        System.out.println("Request Status Updated Successfully");

	    } catch (Exception e) {

	        e.printStackTrace();
	    }
	}
}
