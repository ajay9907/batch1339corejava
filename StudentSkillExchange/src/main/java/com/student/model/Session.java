package com.student.model;

import java.sql.Date;
import java.sql.Time;

public class Session {

	private int sessionId;
	private int requestId;
	private Date sessionDate;
	private Time sessionTime;
	private String mode;
	private String status;

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public Date getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(Date sessionDate) {
		this.sessionDate = sessionDate;
	}

	public Time getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(Time sessionTime) {
		this.sessionTime = sessionTime;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}