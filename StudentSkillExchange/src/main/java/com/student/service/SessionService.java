package com.student.service;

import com.student.dao.SessionDAO;
import com.student.model.Session;

public class SessionService {

    private SessionDAO sessionDAO = new SessionDAO();

    // Schedule Session
    public void scheduleSession(Session session) {

        sessionDAO.scheduleSession(session);
    }

    // Get Sessions By Request ID
    public void getSessionsByRequestId(int requestId) {

        sessionDAO.getSessionsByRequestId(requestId);
    }

    // Update Session Status
    public void updateSessionStatus(int sessionId, String status) {

        sessionDAO.updateSessionStatus(sessionId, status);
    }
}