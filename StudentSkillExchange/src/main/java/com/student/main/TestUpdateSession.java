package com.student.main;

import com.student.dao.SessionDAO;

public class TestUpdateSession {

    public static void main(String[] args) {

        SessionDAO dao = new SessionDAO();

        // Session ID 2
        dao.updateSessionStatus(2, "COMPLETED");
    }
}