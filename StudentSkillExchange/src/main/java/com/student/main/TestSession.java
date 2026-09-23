package com.student.main;

import java.sql.Date;
import java.sql.Time;

import com.student.dao.SessionDAO;
import com.student.model.Session;

public class TestSession {

	public static void main(String[] args) {

		Session session = new Session();

		// Accepted Request ID
		session.setRequestId(2);

		// Session date
		session.setSessionDate(Date.valueOf("2026-09-25"));

		// Session time
		session.setSessionTime(Time.valueOf("10:00:00"));

		// Online session
		session.setMode("ONLINE");

		// Initial status
		session.setStatus("SCHEDULED");

		SessionDAO dao = new SessionDAO();

		dao.scheduleSession(session);
	}
}
