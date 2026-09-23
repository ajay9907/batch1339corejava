package com.student.service;

import com.student.dao.MatchingDAO;

public class MatchingService {

    private MatchingDAO matchingDAO = new MatchingDAO();

    // Find Skill Matches
    public void findMatches(int studentId) {

        matchingDAO.findMatches(studentId);
    }
}