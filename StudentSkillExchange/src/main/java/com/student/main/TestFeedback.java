package com.student.main;

import com.student.dao.FeedbackDAO;
import com.student.model.Feedback;

public class TestFeedback {

    public static void main(String[] args) {

        Feedback feedback = new Feedback();

        // Completed Session ID
        feedback.setSessionId(2);

        // Student ID
        feedback.setStudentId(2);

        // Rating
        feedback.setRating(5);

        // Comment
        feedback.setComment("Very helpful session");

        FeedbackDAO dao = new FeedbackDAO();

        dao.addFeedback(feedback);
    }
}