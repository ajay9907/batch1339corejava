package com.student.main;

import com.student.dao.FeedbackDAO;

public class TestGetFeedback {

    public static void main(String[] args) {

        FeedbackDAO dao = new FeedbackDAO();

        dao.getFeedbackBySessionId(2);
    }
}