package com.student.main;

import com.student.dao.SessionDAO;

public class TestGetSession {

    public static void main(String[] args) {

        SessionDAO dao = new SessionDAO();

        dao.getSessionsByRequestId(2);
    }
}