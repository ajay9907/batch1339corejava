package com.student.main;

import com.student.dao.ExchangeRequestDAO;

public class TestExchangeRequest {

	public static void main(String[] args) {

		ExchangeRequestDAO dao = new ExchangeRequestDAO();

		dao.updateRequestStatus(2, "ACCEPTED");

		// Rahul = receiver ID 1
//		dao.getRequestsByReceiverId(1);
	}
}