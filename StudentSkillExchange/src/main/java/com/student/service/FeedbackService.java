package com.student.service;

import com.student.dao.FeedbackDAO;
import com.student.model.Feedback;

public class FeedbackService {

    private FeedbackDAO feedbackDAO = new FeedbackDAO();

    // Add Feedback
    public void addFeedback(Feedback feedback) {

        feedbackDAO.addFeedback(feedback);
    }

    // Get Feedback By Session ID
    public void getFeedbackBySessionId(int sessionId) {

        feedbackDAO.getFeedbackBySessionId(sessionId);
    }
}