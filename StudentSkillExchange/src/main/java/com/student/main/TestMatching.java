package com.student.main;

import com.student.dao.MatchingDAO;

public class TestMatching {

	public static void main(String[] args) {

		MatchingDAO dao = new MatchingDAO();

		// Priya = Student ID 2
		dao.findMatches(2);
	}
}