package com.student.service;

import com.student.dao.ExchangeRequestDAO;
import com.student.model.ExchangeRequest;

public class ExchangeRequestService {

    private ExchangeRequestDAO exchangeRequestDAO = new ExchangeRequestDAO();

    // Send Exchange Request
    public void sendRequest(ExchangeRequest request) {

        exchangeRequestDAO.sendRequest(request);
    }

    // Get Requests By Receiver ID
    public void getRequestsByReceiverId(int receiverId) {

        exchangeRequestDAO.getRequestsByReceiverId(receiverId);
    }

    // Update Request Status
    public void updateRequestStatus(int requestId, String status) {

        exchangeRequestDAO.updateRequestStatus(requestId, status);
    }
}