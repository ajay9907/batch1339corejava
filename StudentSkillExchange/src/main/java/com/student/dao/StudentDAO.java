package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentDAO {

	public void registerStudent(Student student) {

		String sql = "INSERT INTO student " + "(name, email, password, mobile, course, year) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";

		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getPassword());
			ps.setString(4, student.getMobile());
			ps.setString(5, student.getCourse());
			ps.setInt(6, student.getYear());

			ps.executeUpdate();

			System.out.println("Student Registered Successfully");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public Student loginStudent(String email, String password) {

		String sql = "SELECT * FROM student WHERE email = ? AND password = ?";

		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				Student student1 = new Student();

				student1.setStudentId(rs.getInt("student_id"));
				student1.setName(rs.getString("name"));
				student1.setEmail(rs.getString("email"));
				student1.setPassword(rs.getString("password"));
				student1.setMobile(rs.getString("mobile"));
				student1.setCourse(rs.getString("course"));
				student1.setYear(rs.getInt("year"));

				return student1;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	public Student getStudentById(int studentId) {

		String sql = "SELECT * FROM student WHERE student_id = ?";

		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, studentId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				Student student = new Student();

				student.setStudentId(rs.getInt("student_id"));
				student.setName(rs.getString("name"));
				student.setEmail(rs.getString("email"));
				student.setPassword(rs.getString("password"));
				student.setMobile(rs.getString("mobile"));
				student.setCourse(rs.getString("course"));
				student.setYear(rs.getInt("year"));

				return student;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	public void updateStudent(Student student) {

		String sql = "UPDATE student " + "SET name = ?, mobile = ?, course = ?, year = ? " + "WHERE student_id = ?";

		try {

			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getName());
			ps.setString(2, student.getMobile());
			ps.setString(3, student.getCourse());
			ps.setInt(4, student.getYear());
			ps.setInt(5, student.getStudentId());

			ps.executeUpdate();

			System.out.println("Student Profile Updated Successfully");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}